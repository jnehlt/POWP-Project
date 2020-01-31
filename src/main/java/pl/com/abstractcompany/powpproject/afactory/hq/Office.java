package pl.com.abstractcompany.powpproject.afactory.hq;

public class Office implements Headquarters{
    private String officeName;
    private String address;
    private String specialisation;
    private Integer numberOfWorkers;

    @Override
    public String getType() {
        return "office";
    }

    @Override
    public String getName() {
        return this.officeName;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getBasicInfo() {
        return "Specialisation: \"" + this.specialisation + "\", number of workers: " + this.numberOfWorkers;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }
}
