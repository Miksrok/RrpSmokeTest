package ua.gov.nais.models;

public class RealEstate {

    private String city;
    private String street;
    private String buildingType;
    private String buildingNumber;
    private String apartmentType;
    private String apartmentNumber;

    public RealEstate(){
        this.city = "м.Київ";
        this.street = "Антоновича";
        this.buildingType = "будинок";
        this.buildingNumber = "999";
        this.apartmentType = "квартира";
        this.apartmentNumber = "999";
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getApartmentType() {
        return apartmentType;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }
}
