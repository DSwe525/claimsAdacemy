package PracticeClasses;

public class Car {
    
    private String vin;
    private String color;
    private Integer numberOfWheels;
    private String year;
    private String make;
    private String model;




    //For classes, always use non-primitive variables (Upper-Case)

    public Car() {
    // constructor is a special function, unique to the class.  Constructs the class.
    }

    public Car(String vin, String color, Integer numberOfWheels, String year, String make, String model) {
    this.vin = vin;
    this.color = color;
    this.numberOfWheels = numberOfWheels;
    this.year = year;
    this.make = make;
    this.model = model;

    }
    public void drive() {

    }
    public void brake() {

    }
    public void heatSeats() {

    }
    public void playMusic() {

    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
        public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}