package pl.com.abstractcompany.powpproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.com.abstractcompany.powpproject.repository.ProfilesRepository;

@Service
@RequiredArgsConstructor
public class ProfilesService {
    private final ProfilesRepository profilesRepository;
}
