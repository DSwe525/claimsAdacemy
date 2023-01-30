package SallysLemonadeStand;

public class Address {
    
    Integer houseNumber;
    Integer unitNumber;
    String street;
    String city;
    String state;
    Integer zipCode;
    
    public Address() {
    }
    public Address(Integer houseNumber, String street, String city, String state, Integer zipCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public Integer getHouseNumber() {
        return houseNumber;
    }
    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Integer getZipCode() {
        return zipCode;
    }
    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
    @Override
    public String toString() {
        return "Address [houseNumber=" + houseNumber + ", unitNumber=" + unitNumber + ", street=" + street + ", city="
                + city + ", state=" + state + ", zipCode=" + zipCode + "]";
    }

    

}
