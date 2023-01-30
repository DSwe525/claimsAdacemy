package LabProjects;

import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number: ");
        int userInput = scanner.nextInt();
        int numeratorInput = 30;
        int denomenatorInput = 15;

		//isFactor(numeratorInput, denomenatorInput);
        isPerfect(userInput);
        isPrime(userInput);
	}

	    public static void max3() {
		
            int num1 = 70;
            int num2 = 100;
            int num3 = 60;

        	    if (num1 >= num2 && num1 >= num3) {
        		    System.out.println("Number 1 which equals " + num1 + " is the biggest number");
        	    }  	else if (num2 >= num3) {
        			    System.out.println("Number 2 which equals " + num2 + " is the biggest number");
            	    }  else {
                            System.out.println("Number 3 which equals " + num3 + " is the biggest number");
            	    }
        	    }
	
        public static void min3() {

        int num1 = 70;
        int num2 = 100;
        int num3 = 60;

        if (num1 <= num2 && num1 <= num3) {
        	System.out.println("Number 1 which equals " + num1 + " is the smallest number");
        }  	else if (num2 <= num3) {
        		System.out.println("Number 2 which equals " + num2 + " is the smallest number");
            }  else {
                    System.out.println("Number 3 which equals " + num3 + " is the smallest number");
            }
        }
        
        public static void middle3() {

            int num1 = 79;
            int num2 = 72;
            int num3 = 67;
    
            if (num1 >= num2 && num1 <= num3 || num1 <= num2 && num1 >= num3) {
                System.out.println("Number 1 which equals " + num1 + " is the middle number");
            }  	else if (num2 >= num3 && num2 <= num1 || num2 <= num3 && num2 >= num1) {
                    System.out.println("Number 2 which equals " + num2 + " is the middle number");
                }  else {
                        System.out.println("Number 3 which equals " + num3 + " is the middle number");
                }
            }
        
        public static void xor() {

            boolean booleanOne = false;
            boolean booleanTwo = false;

            boolean booleanValue =(booleanOne ^ booleanTwo);
            System.out.println(booleanValue);

        }
            
        public static boolean isFactor(int numeratorInput, int denomenatorInput) {

            if (numeratorInput % denomenatorInput == 0) {
                //System.out.println("It is a factor");
                return true;
            } else {
                //System.out.println("It is not a factor");
                return false;
            }
        }
        public static void isPerfect(int userInput) {

        int totalOfFactors = 0;
            for (int i = 1; i < userInput; i++) {
            
                if (isFactor(userInput, i)) {
                        
                    totalOfFactors += i; 
                    }    
                }
                if (totalOfFactors == userInput) {
                    System.out.println("It is a perfect number");
                        
                } else {
                    System.out.println("It is not a perfect number");
            }
        }
        public static boolean isPrime(int userInput) {

            for (int ind = 2; ind < userInput; ind++) {

                if (isFactor(userInput, ind))   {
                    System.out.println("Not prime");
                    return false;
                }
            }
            System.out.println("It is prime");
            return true;
                }
            
        }      

    