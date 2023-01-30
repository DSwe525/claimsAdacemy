package SallysLemonadeStand;

public class Product {
    
    
    String name;
    Double price;
    String description;
    
    public Product() {

    }

    public Product(String name, Double price, String description) {

        this.name = name;
        this.price = price;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice(Integer age) {
        if(age < 13) {

            return price * .7;

        }
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }



}
