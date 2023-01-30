package LabAbstraction;

public class Employee extends Person {
    
    public double taxes(double amount) {
        
        amount = amount *.2;
        return amount;
    }
}
