package pl.com.abstractcompany.powpproject.afactory.hq;

public class Warehouse implements Headquarters{
    private String name;
    private String address;
    private Integer numberOfWorkers;
    private Integer storageArea;
    private Integer loadingPlatforms;

    @Override
    public String getType() {
        return "warehouse";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getBasicInfo() {
        return "Storage area: " + this.storageArea + ", number of loading platforms: " + this.loadingPlatforms
                + ", number of workers: " + this.numberOfWorkers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public void setStorageArea(Integer storageArea) {
        this.storageArea = storageArea;
    }

    public void setLoadingPlatforms(Integer loadingPlatforms) {
        this.loadingPlatforms = loadingPlatforms;
    }
}
