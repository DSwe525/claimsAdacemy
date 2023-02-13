package com.pmr.entity;

import javax.persistence.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "car")
public class Car {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="year")
    private String year;
    @Column(name="make")
    private String make;
    @Column(name="model")
    private String model;
    @Column(name="vin")
    private String vin;
    @Column(name="milage")
    private Integer milage;
    @Column(name="image")
    private String image;
    @Column(name="description")
    private String description;
    @Column(name="new_or_used")
    private String newOrUsed;
    @Column(name="price")
    private Double price;
    @Column(name="date_created")
    LocalDateTime dateCreated = LocalDateTime.now();
    
    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getMilage() {
        return milage;
    }

    public void setMilage(Integer milage) {
        this.milage = milage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {

        if(LocalDateTime.now().isAfter(dateCreated.plusDays(120))) {
            return this.price * .90;
        }

        return this.price;
    }
    

    public void setPrice(Double price) {
        this.price = price;
    }
    public String getNewOrUsed() {
        return newOrUsed;
    }

    public void setNewOrUsed(String newOrUsed) {
        this.newOrUsed = newOrUsed;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", year=" + year + ", make=" + make + ", model=" + model + ", vin=" + vin + ", milage="
                + milage + ", image=" + image + ", description=" + description + ", newOrUsed=" + newOrUsed + ", price="
                + price + "]";
    }

}

    



