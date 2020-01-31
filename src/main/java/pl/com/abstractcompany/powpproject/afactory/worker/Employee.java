package pl.com.abstractcompany.powpproject.afactory.worker;

public class Employee implements Worker {
    private String firstName;
    private String lastName;
    private String pesel;

    @Override
    public String getWorkerType() {
        return "employee";
    }

    @Override
    public String getBasicInformation() {
        return "[" + this.firstName + " " + this.lastName + " PESEL: " + this.pesel;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
