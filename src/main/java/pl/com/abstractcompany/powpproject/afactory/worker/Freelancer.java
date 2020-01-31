package pl.com.abstractcompany.powpproject.afactory.worker;

public class Freelancer implements Worker{
    private String name;
    private String nip;

    @Override
    public String getWorkerType() {
        return "freelancer";
    }

    @Override
    public String getBasicInformation() {
        return "Name: [" + this.name + "], NIP: [" + this.nip + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
