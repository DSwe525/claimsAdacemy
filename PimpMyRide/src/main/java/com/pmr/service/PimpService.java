package com.pmr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmr.entity.Car;
import com.pmr.entity.Pimp;
import com.pmr.repo.PimpRepo;

@Service
public class PimpService {

    @Autowired
    PimpRepo pimpRepo;
    @Autowired
    CarService carService;

    public Pimp save(Pimp pimp) {

        return pimpRepo.save(pimp);

    }
    public Pimp getByEmail(String email) {

        Pimp pimp = pimpRepo.getAccountByEmail(email);

        if(pimp == null) {
            return null;
        }
        return pimp;
    }
    public Pimp signIn(Pimp pimp) {

        Pimp signedInPimp = pimpRepo.getAccountByEmailAndPassword(pimp.getEmail(), pimp.getPassword());

        if(signedInPimp == null) {
            return null;
        }
        return signedInPimp;
    }
    public void deleteById(Integer id) {

        pimpRepo.deleteById(id);
    }

    public Pimp update(Pimp pimp) {

        return pimpRepo.save(pimp);
    }
    public Pimp getById(Integer id) {

        return pimpRepo.findById(id).get();
    }
    public Pimp buyCar(String email, String vin) {

        Pimp loggedInPimp = getByEmail(email);

        Car car = carService.getByVin(vin);

        loggedInPimp.getParkingLot().add(car);

        return save(loggedInPimp);
    }
}
