package pl.com.abstractcompany.powpproject.service;

import org.springframework.stereotype.Service;
import pl.com.abstractcompany.powpproject.dto.ProfileDto;
import pl.com.abstractcompany.powpproject.model.Profile;
import pl.com.abstractcompany.powpproject.repository.ProfilesRepository;
import pl.com.abstractcompany.powpproject.repository.SalariesRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class ProfilesService {
    private final ProfilesRepository profilesRepository;
    private final SalariesRepository salariesRepository;

    //Dependency injection pattern (thanks SpringFramework!!)
    public ProfilesService(ProfilesRepository profilesRepository, SalariesRepository salariesRepository) {
        this.profilesRepository = profilesRepository;
        this.salariesRepository = salariesRepository;
    }

    public List<ProfileDto> getAllProfilesWithSalaries(){
        List<ProfileDto> profileDtos = new ArrayList<>();
        try(Stream<Profile> profiles = profilesRepository.getAllProfiles()){
          profiles.forEach(profile -> {
              //Decorator pattern - "Decorating" profile data with data from Salariesrepository
              var profileSalary = salariesRepository.getSalaryForProfileId(profile.getId());
              var dto = ProfileDto.builder()
                      .name(profile.getName())
                      .surname(profile.getSurname())
                      .email(profile.getEmail())
                      .phone(profile.getPhone())
                      .position(profile.getPosition())
                      .grossSalary(profileSalary.getGrossSalary())
                      .build();
              profileDtos.add(dto);
          });
        }
        return profileDtos;
    }


}
