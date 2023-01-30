package SallysLemonadeStand;

import java.util.Scanner;

import org.junit.internal.builders.NullBuilder;

import java.util.ArrayList;
import java.util.List;

public class SallysLemonadeStand {
    
    // Different types of non primitive arrays
    // List (Focus)
    // ArrayList (Focus)
    // Queue
    // Stack

    static List<Suckers> suckersList = new ArrayList<Suckers>();
    // static ArrayList<Suckers> myArrayList = new ArrayList<Suckers>();
    // Either one works
   
    // static Suckers myFirstSucker = new Suckers(20, "Meme@aol.com", "Dan", "Sweeney", "978-837-1440", "HelloFriend");

    static Product lemonade = new Product("Sallys Lemonade", 5.00, "Best lemonade in the town");
    static Product soda = new Product("Sallys Soda", 3.50, "Soda be fizzin");
    static Product water = new Product("Sallys water", 2.50, "Goes down like water");

    public static void main(String[] args) {

     //   myFirstSucker.getAddress().getCity()


        int selection = 0;
        
        
        while(selection != 4) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sally's Lemonade Stand");

        System.out.println("1 - Sign up");
        System.out.println("2 - Sign in");
        System.out.println("3 - Enter as a guest");

        selection = scanner.nextInt();
        scanner.nextLine();

        switch(selection) {
            case 1:
            Suckers signedUpSucker = SignUp(scanner);

            orderProducts(selection,scanner,signedUpSucker);
            break;
            case 2:
            
            break;
            case 3:
            orderProducts(selection,scanner,null);
            break;
            case 4:
            System.out.println("4 - Close up shop");
            break;
            default:
            System.out.println("Stop it Billy");

        }
        // System.out.println("Your package will be shipped");
        // System.out.println(signedUpSucker.getAddress().toString());
        // System.out.println("Stop it Billy");
    }
}

public static Suckers SignUp(Scanner scanner) {
    
    System.out.println("Please enter your first name: ");
    String firstName = scanner.nextLine();
    System.out.println("Please enter your last name: ");
    String lastName = scanner.nextLine();
    System.out.println("Please enter your age: ");
    Integer age = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Please enter your phone number: ");
    String phoneNumber = scanner.nextLine();
    System.out.println("Please enter your email: ");
    String email = scanner.nextLine();
    System.out.println("Please enter your password: ");
    String password = scanner.nextLine();

    Suckers sucker = new Suckers(age,email,firstName,lastName,phoneNumber,password);

    Address address = getAddress(scanner);

    sucker.setAddress(address);

    suckersList.add(sucker);

    return sucker;

}

public static Address getAddress(Scanner scanner) {

    System.out.println("Please enter you address information");
    System.out.println("What is your house number:");
    Integer houseNumber = scanner.nextInt();
    scanner.nextLine();
    //System.out.println("Do you have a unit number?");
    //boolean bool = scanner.nextBoolean();
    /*Integer unitNumber = null;
    if(bool) {
        System.out.println("What is your unit number: ");
        unitNumber = scanner.nextInt();
        scanner.nextLine();
    */
    System.out.println("Please enter you street name: ");
    String streetName = scanner.nextLine();
    System.out.println("Please enter you city: ");
    String city = scanner.nextLine();
    System.out.println("Please enter you state: ");
    String state = scanner.nextLine();
    System.out.println("Please enter you zip code: ");
    Integer zipCode = scanner.nextInt();

    Address address = new Address(houseNumber, streetName, city, state, zipCode);

    return address;
}

public static void signIn(Scanner scanner){

    System.out.println("What is your email: ");
    String email = scanner.nextLine();
    System.out.println("What is your password: ");
    String password = scanner.nextLine();

    boolean bool = true;

    for (int i = 0; i < suckersList.size(); i++) {

        if (email == suckersList.get(i).getEmail() && 
            password == suckersList.get(i).getPassword()) {

            orderProducts(null, scanner, suckersList.get(i));
            bool = false;
            break;
        }
    }
    if (bool)
        System.out.println("No user found!");
}

    public static void orderProducts(Integer selection, Scanner scanner, Suckers signedUpSucker) {

        System.out.println("What can we get for you today: ");
        System.out.println("1 - Lemonade");
        System.out.println("2 - Soda");
        System.out.println("3 - Water");
        
        selection = scanner.nextInt();

        switch(selection) {
            case 1:
            if (signedUpSucker.getAge() < 13)
            System.out.println("You have selected Lemonade, the price will be " + String.format("%.2f", lemonade.getPrice(
                signedUpSucker == null ? 900 : signedUpSucker.getAge())));
            //System.out.println("You have selected Lemonade, the price will be " + String.format("%.2f", lemonade.getPrice(signedUpSucker.getAge())));
            break;
            case 2:
            System.out.println("You have selected sode, the price will be " + String.format("%.2f", soda.getPrice(
                signedUpSucker == null ? 900 : signedUpSucker.getAge())));
            break;
            case 3:
            System.out.println("You have selected water, the price will be " + String.format("%.2f", water.getPrice(signedUpSucker == null ? 900 : signedUpSucker.getAge())));
            break;

        }
        
        System.out.println("Thanks for coming sucka");
    }

}
