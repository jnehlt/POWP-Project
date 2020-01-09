package pl.com.abstractcompany.powpproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.abstractcompany.powpproject.dto.ProfileDto;
import pl.com.abstractcompany.powpproject.service.ProfilesService;

import java.util.List;

@RestController
public class ProfilesController {
    private ProfilesService profilesService;

    public ProfilesController(ProfilesService profilesService) {
        this.profilesService = profilesService;
    }

    @GetMapping("/allProfilesWithSalaries")
    public ResponseEntity<List<ProfileDto>> getAllProfilesWithSalaries(){
        return new ResponseEntity<>(profilesService.getAllProfilesWithSalaries(), HttpStatus.OK);
    }

    @GetMapping("/allProfilesWithSalariesInEur")
    public ResponseEntity<ProfileDto> getAllProfilesWithSalariesInEur(){
        return new ResponseEntity<>(HttpStatus.OK); //TODO proper endpoint logic
    }
}
