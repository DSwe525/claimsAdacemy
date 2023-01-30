package LabAbstraction;

import java.util.ArrayList;
import java.util.List;

public class Application {
    

    public static void main(String[] args) {
        
        Student student1 = new Student();
        Employee employee1 = new Employee();
        Person person1 = new Student();
        Person person2 = new Employee();

        student1.setFirstName("John");
        student1.setLastName("Smith");
        employee1.setFirstName("Jane");
        employee1.setLastName("Shaw");
        person1.setFirstName("Dan");
        person1.setLastName("Sweeney");
        person2.setFirstName("Patrick");
        person2.setLastName("Star");

        List<Student> students = new ArrayList<Student>();
        List<Employee> employees = new ArrayList<Employee>();

        students.add(student1);
        employees.add(employee1);

        double studentTeleBill = student1.calculatePhoneBill(120.5);
        System.out.println(studentTeleBill);

        double employeeTeleBill = employee1.calculatePhoneBill(120.5);
        System.out.println(employeeTeleBill);
        
        double studentTwoTeleBill = person1.calculatePhoneBill(120.5);
        System.out.println(studentTwoTeleBill);

        double employeetwoTeleBill = person2.calculatePhoneBill(120.5);
        System.out.println(employeetwoTeleBill);

        System.out.println();
        System.out.println(student1);
        System.out.println(employee1);
        System.out.println(person1);
        System.out.println(person2);

        
    }
}
