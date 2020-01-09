package pl.com.abstractcompany.powpproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Profile {
    private String name;
    private String surname;
    private String position;
    private String email;
    private String phone;
}
