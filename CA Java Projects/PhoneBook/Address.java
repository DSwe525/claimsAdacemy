package PhoneBook;

public class Address extends People {
    
    Integer houseAptNumber;
    String streetName;
    String city;
    String state;
    String zipCode;

    public Address() {
        
    }

    public Address(Integer houseAptNumber, String streetName, String city, String state, String zipCode) {
        this.houseAptNumber = houseAptNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Integer getHouseAptNumber() {
        return houseAptNumber;
    }

    public void setHouseAptNumber(Integer houseAptNumber) {
        this.houseAptNumber = houseAptNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return houseAptNumber + " " + streetName + ", " + city
                + ", " + state + ", " + zipCode + ",";
    }

}
