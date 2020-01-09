package pl.com.abstractcompany.powpproject.repository;

import org.springframework.stereotype.Repository;
import pl.com.abstractcompany.powpproject.model.Profile;

import java.util.stream.Stream;

@Repository
//it's a mocked repository. We dont want to use any db or whatsoever - there is no need of that
public class ProfilesRepository {
    public Stream<Profile> getAllProfiles(){
        var profile1 = new Profile(1L,"Jan", "Kowalski", "Szef wszystkich szefów", "jk@powp.com", "123456789");
        var profile2 = new Profile(2L,"Igrek", "Iksiński", "Konserwator powieszchni płaskich", "ii@powp.com", "987321456");
        var profile3 = new Profile(3L, "John", "Doe", "Manager", "jd@powp.com", "999888777");

        return Stream.of(profile1, profile2, profile3);
    }
}
