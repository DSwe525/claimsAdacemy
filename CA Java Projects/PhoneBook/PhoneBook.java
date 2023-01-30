package PhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class PhoneBook {
    
    static List<Address> addressList = new ArrayList<Address>();
    static List<People> peopleList = new ArrayList<People>();

    public static void main(String[] args) {
        System.out.println("Welcome to the Phone Book Application!");
        System.out.println("==========================================================");

    int selection = 0;

        while(selection != 6) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("==========================================================");
            System.out.println("Please select from the following menu options: ");

            System.out.println("1 - Add new entry");
            System.out.println("2 - Search for an existing entry");
            System.out.println("3 - Delete an previous entry");
            System.out.println("4 - Update a previous entry");
            System.out.println("5 - Show all records");
            System.out.println("6 - Exit");
    
            selection = scanner.nextInt();
            scanner.nextLine();
    
            switch(selection) {
                case 1:
                addToRecord(scanner);
                break;
                case 2:
                searchForEntry(scanner);
                break;
                case 3:
                deleteEntry(scanner);
                break;
                case 4:
                updateRecord(scanner);
                break;
                case 5:
                sortEntries();
                break;
                case 6:
                System.out.println("Thank you for using the phone book application, cya nerd!");
                System.out.println("============================================================================================");
                System.out.println("============================================================================================");
                System.out.println("============================================================================================");
                System.exit(1);
                break;
                default:

            }
        }
}

    public static People addToRecord(Scanner scanner) {
    
        System.out.println("==========================================================");
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("==========================================================");
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("==========================================================");
        System.out.println("Please enter your middle name (If Applicable): ");
        String middleName = scanner.nextLine();
        System.out.println("==========================================================");
        System.out.println("Please enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("==========================================================");
        System.out.println("Please enter your house/apartment number: ");
        Integer houseAptNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("==========================================================");
        System.out.println("Please enter your street name: ");
        String streetName = scanner.nextLine();
        System.out.println("==========================================================");
        System.out.println("Please enter your city: ");
        String city = scanner.nextLine();
        System.out.println("==========================================================");
        System.out.println("Please enter your state: ");
        String state = scanner.nextLine();
        System.out.println("==========================================================");
        System.out.println("Please enter your zip code: ");
        String zipCode = scanner.next();

        Address address = new Address(houseAptNumber, streetName, city, state, zipCode);
        People people = new People(firstName, lastName, middleName, address, phoneNumber);

        peopleList.add(people);

        System.out.println("==========================================================");
        System.out.println("Successfully added entry!");
        System.out.println("==========================================================");

        return people; }

    public static void searchForEntry(Scanner scanner) {

        int selection;

        System.out.println("Please select the parameter you would like to search:");
        System.out.println("==========================================================");
        System.out.println("1 - First Name");
        System.out.println("2 - Last Name");
        System.out.println("3 - Full Name");
        System.out.println("4 - Phone Number");
        System.out.println("5 - City");
        System.out.println("6 - State");

        selection = scanner.nextInt();
        scanner.nextLine();

            switch(selection) {
            case 1:
            System.out.println("Please enter the first name: ");
            System.out.println("==========================================================");
            String lookupFirstName = scanner.next();
            for (int i = 0; i < peopleList.size(); i++) {
                if (peopleList.get(i).getFirstName().equals(lookupFirstName)) {
                    System.out.println(peopleList.get(i)); }
            }
            break;
            case 2:
            System.out.println("Please enter the last name: ");
            System.out.println("==========================================================");
            String lookupLastName = scanner.next();
            for (int i = 0; i < peopleList.size(); i++) {
                if (peopleList.get(i).getLastName().equals(lookupLastName)) {
                    System.out.println(peopleList.get(i)); }
            }
            break;
            case 3:
            // Need to fix, not showing up in results
            System.out.println("Please enter the full name: ");
            System.out.println("==========================================================");
            String lookupFullName = scanner.nextLine();
            for (int i = 0; i < peopleList.size(); i++) {
                if (lookupFullName.equals(peopleList.get(i).getFirstName() + " " + peopleList.get(i).getLastName())) {
                    System.out.println(peopleList.get(i)); }
            }
            break;
            case 4:
            System.out.println("Please enter the phone number: ");
            System.out.println("==========================================================");
            String lookupPhoneNumber = scanner.next();
            for (int i = 0; i < peopleList.size(); i++) {
                if (peopleList.get(i).getPhoneNumber().equals(lookupPhoneNumber)) {
                    System.out.println(peopleList.get(i)); }
            }
            break;
            case 5:
            System.out.println("Please enter the city: ");
            System.out.println("==========================================================");
            String lookupCity = scanner.next();
            for (int i = 0; i < peopleList.size(); i++) {
                if (peopleList.get(i).getAddress().getCity().equals(lookupCity)) {
                    System.out.println(peopleList.get(i)); }
            }
            break;
            case 6:
            System.out.println("Please enter the state: ");
            System.out.println("==========================================================");
            String lookupState = scanner.next();
            for (int i = 0; i < peopleList.size(); i++) {
                if (peopleList.get(i).getAddress().getState().equals(lookupState)) {
                    System.out.println(peopleList.get(i)); }
            }
            break;
            default:
                searchForEntry(scanner); }
     }

    public static void deleteEntry(Scanner scanner) {

        System.out.println("Please select one of the following options:");
        System.out.println("==========================================================");
        System.out.println("1 - Remove a phone number from the records");
        System.out.println("2 - Exit");
        Integer selection = scanner.nextInt();
        scanner.nextLine();

        if (selection == 1) {
        System.out.println("Please enter the phone number you would like removed: ");
        System.out.println("==========================================================");
        String removePhoneNumber = scanner.next();
        for (int i = 0; i < peopleList.size(); i++) {
            if (peopleList.get(i).getPhoneNumber().equals(removePhoneNumber)) {
                peopleList.remove(peopleList.get(i));
                System.out.println("The record has been removed!");
            } else {
                System.out.println("Phone Number does not exist in our records..."); }
        }
        } else if (selection == 2) {
        } else {
            System.out.println("Invalid Entry");
        }
    }

    public static void updateRecord(Scanner scanner) {
        
        int selection;
        String phoneNumberUpdate;

        System.out.println("Please provide the phone number you need to update:");
        System.out.println("==========================================================");
        phoneNumberUpdate = scanner.next();

        for (int i = 0; i < peopleList.size(); i++) {
            if (peopleList.get(i).getPhoneNumber().equals(phoneNumberUpdate)) {

                System.out.println("Please choose what information you would like to update:");
                System.out.println("==========================================================");
                System.out.println("1 - First Name");
                System.out.println("2 - Last Name");
                System.out.println("3 - Phone Number");
                System.out.println("4 - House or Apartment Number");
                System.out.println("5 - Street Name");
                System.out.println("6 - City");
                System.out.println("7 - State");
                System.out.println("8 - Zip Code");

                selection = scanner.nextInt();

                switch(selection) {
                    case 1:
                    System.out.println("To confirm, please enter the first name: ");
                    System.out.println("==========================================================");
                    String lookupFirstName = scanner.next();
                    for (int j = 0; j < peopleList.size(); j++) {
                        if (peopleList.get(j).getFirstName().equals(lookupFirstName)) {
                            System.out.println("Please enter the first name you would like to update to: ");
                            System.out.println("==========================================================");
                            String firstNameChange = scanner.next();
                            peopleList.get(j).setFirstName(firstNameChange); }
                        else {
                            System.out.println("Entry Invalid"); } }
                    break;
                    case 2:
                    System.out.println("To confirm, please enter the last name: ");
                    System.out.println("==========================================================");
                    String lookupLastName = scanner.next();
                    for (int j = 0; j < peopleList.size(); j++) {
                        if (peopleList.get(j).getLastName().equals(lookupLastName)) {
                            System.out.println("Please enter the last name you would like to update to: ");
                            System.out.println("==========================================================");
                            String lastNameChange = scanner.next();
                            peopleList.get(j).setLastName(lastNameChange); }
                        else {
                            System.out.println("Entry Invalid"); } }
                    break;
                    case 3:
                    System.out.println("To confirm, please enter the phone number again: ");
                    System.out.println("==========================================================");
                    String lookupPhoneNumber = scanner.next();
                    for (int j = 0; j < peopleList.size(); j++) {
                        if (peopleList.get(j).getPhoneNumber().equals(lookupPhoneNumber)) {
                            System.out.println("Please enter the phone number you would like to update to: ");
                            System.out.println("==========================================================");
                            String phoneNumberChange = scanner.next();
                            peopleList.get(j).setPhoneNumber(phoneNumberChange); }
                        else {
                            System.out.println("Entry Invalid"); } }
                    break;
                    case 4:
                    System.out.println("To confirm, please enter the house number: ");
                    System.out.println("==========================================================");
                    Integer lookupHouseNumber = scanner.nextInt();
                    scanner.nextLine();
                    for (int j = 0; j < peopleList.size(); j++) {
                        if (addressList.get(j).getHouseAptNumber().equals(lookupHouseNumber)) {
                            System.out.println("Please enter the house number you would like to update to: ");
                            System.out.println("==========================================================");
                            Integer houseNumberChange = scanner.nextInt();
                            addressList.get(j).setHouseAptNumber(houseNumberChange); }
                        else {
                            System.out.println("Entry Invalid"); } }
                    break;
                    case 5:
                    System.out.println("To confirm, please enter the street name: ");
                    System.out.println("==========================================================");
                    String lookupStreetName = scanner.next();
                    for (int j = 0; j < addressList.size(); j++) {
                        if (addressList.get(j).getStreetName().equals(lookupStreetName)) {
                            System.out.println("Please enter the street name you would like to update to: ");
                            System.out.println("==========================================================");
                            String streetNameChange = scanner.next();
                            addressList.get(j).setStreetName(streetNameChange); }
                        else {
                            System.out.println("Entry Invalid"); } }
                    break;
                    case 6:
                    System.out.println("To confirm, please enter city: ");
                    System.out.println("==========================================================");
                    String lookupCityName = scanner.next();
                    for (int j = 0; j < addressList.size(); j++) {
                        if (addressList.get(j).getCity().equals(lookupCityName)) {
                            System.out.println("Please enter the city you would like to update to: ");
                            System.out.println("==========================================================");
                            String cityChange = scanner.next();
                            addressList.get(j).setCity(cityChange); }
                        else {
                            System.out.println("Entry Invalid"); } }
                    break;
                    case 7:
                    System.out.println("To confirm, please enter the state: ");
                    System.out.println("==========================================================");
                    String lookupStateName = scanner.next();
                    for (int j = 0; j < addressList.size(); j++) {
                        if (addressList.get(j).getState().equals(lookupStateName)) {
                            System.out.println("Please enter the state you would like to update to: ");
                            System.out.println("==========================================================");
                            String stateChange = scanner.next();
                            addressList.get(j).setState(stateChange); }
                        else {
                            System.out.println("Entry Invalid"); } }
                    break;
                    case 8:
                    System.out.println("To confirm, please enter the zip code: ");
                    System.out.println("==========================================================");
                    String lookupZipCode = scanner.next();
                    for (int j = 0; j < addressList.size(); j++) {
                        if (addressList.get(j).getZipCode().equals(lookupZipCode)) {
                            System.out.println("Please enter the zip code you would like to update to: ");
                            System.out.println("==========================================================");
                            String zipCodeChange = scanner.next();
                            addressList.get(j).setZipCode(zipCodeChange); } 
                        else {
                            System.out.println("Entry Invalid"); } }
                    break;
                    default: 
                    }
                } else {
                System.out.println("Phone number does not exist..."); } }
    }

    public static void sortEntries() {

        System.out.println("Please see below for the list of all entires: ");
        System.out.println("==========================================================");
        peopleList.stream().sorted(Comparator.comparing(People::getFirstName)
                .thenComparing(People::getLastName)).forEach(System.out::println);
    }
}    


