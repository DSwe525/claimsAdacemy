package PracticeClasses;

import java.util.Scanner;

public class PracticeClasses {
    
    public static void main(String[] args) {

        Car mazda6 = new Car();

        mazda6.setColor("Red");
        mazda6.setMake("Mazda");
        mazda6.setVin("ISDNSUW0184FJ");

        System.out.println(mazda6.toString());

        Car bugatti = new Car("Fake Vin", "Red", 4, "2022", "Bugatti", "Veyron");

        System.out.println(bugatti.toString());

    }

}
