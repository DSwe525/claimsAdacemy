package com.pmr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmr.entity.Car;
import com.pmr.repo.CarRepo;

@Service
public class CarService {
    
    @Autowired
    CarRepo carRepo;
    
    public Car save(Car car) {

        return carRepo.save(car);

    }
    public List<Car> getAll() {
        
        return carRepo.findAll();
        
    }
    public Car getByVin(String vin) {

        Car car = carRepo.getCarByVin(vin);

        if(car == null) {
            return null;
        }
        return car;
    }
    public void deleteById(Integer id) {

        carRepo.deleteById(id);
    }
    public Car update(Car car) {

        return carRepo.save(car);
    }
    public List<String> getListOfMakes(List<Car> carList) {

        List<String> listOfMakes = new ArrayList<String>();
        
        for (Car car : carList) {

            if(!listOfMakes.contains(car.getMake())) {

                listOfMakes.add(car.getMake());
            }
        }
        return listOfMakes;
    }

    public Car getById(Integer id) {

        return carRepo.findById(id).get();
    }
    public List<Car> getCarOnLot() {
        return carRepo.getCarOnLot();
    }

    public List<Car> getCarsOnLotByMake(String make) {
        return carRepo.getCarsOnLotByMake(make);
    }

    public List<Car> getNewOrUsed(String newOrUsed) {
        return carRepo.getNewOrUsed(newOrUsed);
    }
}
