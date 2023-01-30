package PracticeArrays;

public class PracticeArrays {
    
    public static void main(String[] args) {

    int[] arr = {1,2,9,9};
    // int[] arr = {1,2,3,4,5,6,7,8,9,9,7,6,5,5,4,4,3,4,5,6,7,8,9};
    // 1 System.out.println(findAverage(arr));
    numberAdder(arr);
    }

    public static double findAverage(int[] intArray) {

        int totalSum = 0;

        for (int i = 0; i < intArray.length; i++) {

            totalSum += intArray[i];
    }

    double average = ((double) totalSum)/ intArray.length;

    return average;
    }

    public static void sort(int[] intArr) {

        for (int i = 0; i < intArr.length-1; i++) {

            for (int j = i+1; j < intArr.length; j++) {
                
                if(intArr[i] > intArr[j]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
            }
        }
    }
    for (int i = 0; i < intArr.length; i++) {
        System.out.print(intArr[i] + ", ");

        //int[] myArray = {1,2,3,4};
        // Primitive arrays - cannot change their size once values are entered;
        // myArray[3] = 42;

        //How you initilize an array
        //int[] myOtherArray = new int[5];
        //char[] word = {'a', 'b', 'c', 'd'};
        //boolean[] boolArr = new boolean[100];
        //String[] strArr = {"Hi", "Hello", "Hey"};
        //Values can change within the array but not its size

        //System.out.println(myArray);
        //System.out.println(myOtherArray);
        //System.out.println(word);
        //System.out.println(boolArr);
        //System.out.println(strArr);
        
        //For loop is used to search for all of the values
        //for (int i = 0; i < strArr.length; i++) {
        //    System.out.println(strArr[i]);
        //}

    //}
    //int[] onather = new int[5];
    //int[] another = onather;

    //int totalSum = 0;
    //for (int i = 0; i < onather.length; i++

       // int[] myList = new int[10];
      //  int maxnumber = 0;
      //  for (int i = 0; i < myList.length; i++)
      //      if (maxnumber < myList[i]) {
      //          maxnumber = mylist[i];

            
    }
}
    public static void numberAdder(int[] digits) {

        String number = "";
        for (int i = 0; i < digits.length; i++) {

            number = number + digits[i];

            //if(digits[digits.length-1] == 9) {
                //digits[digits.length-2] = digits[digits.length-1] + 1;
                //digits[digits.length-1] = 0;

        }

        System.out.println(number);

        int stringNumber = Integer.parseInt(number);
        stringNumber++;

        String backToString = Integer.toString(stringNumber);

        int[] newArr = new int[backToString.length()];
        for (int i = 0; i < backToString.length(); i++) {
            newArr[i] = (int) backToString.charAt(i);
        }
        for (int i = 0; i < newArr.length; i++)
            System.out.print(newArr[i] + ",");

    }

}   
