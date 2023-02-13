package com.pmr.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pmr.entity.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {
    

    @Query(value="select * from car where vin = ?1", nativeQuery = true)
    public Car getCarByVin(String vin);

    @Query(value = "select * from car where pimp_id is null", nativeQuery = true)
    public List<Car> getCarOnLot();
    
    @Query(value = "select * from car where pimp_id is not null", nativeQuery = true)
    public List<Car> getAllBoughtCars();

    @Query(value = "select * from car where pimp_id is null and new_or_used = ?1", nativeQuery = true)
    public List<Car> getNewOrUsed(String newOrUsed);
    
    @Query(value = "select * from car where pimp_id is null and make = ?1", nativeQuery = true)
    public List<Car> getCarsOnLotByMake(String make);

}
