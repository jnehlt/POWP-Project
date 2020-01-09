package pl.com.abstractcompany.powpproject.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProfileDto {
    private String name;
    private String surname;
    private String position;
    private String email;
    private String phone;
    private BigDecimal grossSalary;

    //BUILDER PATTERN
    private ProfileDto(String name, String surname, String position, String email, String phone, BigDecimal grossSalary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.grossSalary = grossSalary;
    }

    public static ProfileDtoBuilder builder() {
        return new ProfileDtoBuilder();
    }

    public static class ProfileDtoBuilder {
        private String name;
        private String surname;
        private String position;
        private String email;
        private String phone;
        private BigDecimal grossSalary;

        ProfileDtoBuilder() {
        }

        public ProfileDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProfileDtoBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public ProfileDtoBuilder position(String position) {
            this.position = position;
            return this;
        }

        public ProfileDtoBuilder email(String email) {
            this.email = email;
            return this;
        }

        public ProfileDtoBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public ProfileDtoBuilder grossSalary(BigDecimal grossSalary) {
            this.grossSalary = grossSalary;
            return this;
        }

        public ProfileDto build() {
            return new ProfileDto(name, surname, position, email, phone, grossSalary);
        }

        public String toString() {
            return "ProfileDto.ProfileDtoBuilder(name=" + this.name + ", surname=" + this.surname + ", position=" + this.position + ", email=" + this.email + ", phone=" + this.phone + ", grossSalary=" + this.grossSalary + ")";
        }
    }
}
