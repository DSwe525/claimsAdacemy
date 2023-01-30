package LabProject4;

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {

        //Question 1: sumLimit(5,28);

        //Question 2: Scanner scanner = new Scanner(System.in);
        
        //Question 2: System.out.println("What is the temperature outside? ");
        //Question 2: int temp = scanner.nextInt();

        //Question 2: System.out.println("Is it summer, true or false? ");
        //Question 2: boolean summer = scanner.nextBoolean();

        //Question 2: squirrelPlay(temp,summer);

        //Question 3: LotteryTicket();
        //Question 4: findingX();
        
        //Question 5: RepeatedStrings("Exception", 2);
    }
    
    public static void sumLimit () {

        int firstNumber = 8;
        int secondNumber = 20;
        int sum = firstNumber + secondNumber;

        if(String.valueOf(sum).length() > String.valueOf(firstNumber).length()) {
            System.out.println(firstNumber);
          }  else {
          System.out.println(sum);
    }

    }
    public static void squirrelPlay (int temperature, boolean isSummer) {

        boolean SquirrelOutSide = false;

        if (temperature < 60 && temperature > 100) {
            System.out.println(SquirrelOutSide);
        }
            else if (temperature > 60 && temperature < 90) {
            SquirrelOutSide = true;
            System.out.println(SquirrelOutSide);
         }      else if (temperature >= 91 && temperature <= 99 && isSummer == true) {
            SquirrelOutSide = true;
            System.out.println(SquirrelOutSide);
                } else {
            SquirrelOutSide = false;
            System.out.println(SquirrelOutSide);
         }
         

    }
    public static void LotteryTicket() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("pick a number: ");
        int firstNumber =  scanner.nextInt();

        System.out.println("pick another number: ");
        int secondNumber =  scanner.nextInt();

        System.out.println("pick one more number: ");
        int thirdNumber =  scanner.nextInt();

        if (firstNumber != secondNumber && firstNumber != thirdNumber) {
            System.out.println(0);
          }  else if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println(20);
            }  else {
                    System.out.println(10);   
                }
        }
        public static void findingX() {

            String stringArray = "abxxxxftexxf";
            char charArray[] = stringArray.toCharArray();
            int characterCountOfX = 0;

            for (int i = 0; i < stringArray.length() - 1; i++) {

                    if (charArray[i] == 'x' && charArray[i + 1] == 'x') {
                        characterCountOfX++;

                    }
        }
        System.out.println(characterCountOfX);
    }
        public static void RepeatedStrings(String word, int copies) {

            char charArray[] = word.toCharArray();
            int copiesCounter = 0;
                for (int i = 0; i < word.length(); i++) {

                    word.getChars(0, i, charArray, 0);
                        if (copiesCounter < copies) {
                            copiesCounter++;
                            System.out.print(charArray);
                    }
            }
                
    }
}






