package LabAbstraction;

public class Student extends Person {
    
    public double taxes(double amount) {
        
        amount = amount *.02;
        return amount;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }



}
