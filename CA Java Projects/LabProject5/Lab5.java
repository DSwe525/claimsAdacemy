
public class Lab5 {
public static void main(String[] args) {

    countTheAs("banana");
    removeWhiteSpace("the dog likes to eat the cat food");
    findDuplicates("Mississippi");
    reverseString("The bird is the word");

}

public static void countTheAs(String word) {

    char[] array = word.toCharArray();
    int theACount = 0;

    for (int i = 0; i < word.length(); i++) {
        if (array[i] == 'a')
            theACount++;
    }
    System.out.println(theACount);
}

public static void removeWhiteSpace(String word) {
    
    char[] array = word.toCharArray();

    String tempString = "";

    for (int i = 0; i < word.length(); i++) {
        if (array[i] != ' ') {
            tempString += array[i];
        }
    }
    System.out.println(tempString);
}
public static void findDuplicates(String word) {

    char charArray[] = word.toCharArray();
    boolean foundDupe = false;

    for (int i = 0; i < word.length(); i++) {
        for (int j = i + 1 ; j < word.length(); j++) {
            
            if (word.charAt(i) == word.charAt(j)) {
                //duplicate = duplicate.concat(Character.toString(word.charAt(j)));
                    if (!foundDupe) {
                        //duplicate = duplicate.concat(Character.toString(word.charAt(i)));
                        foundDupe = true;
                        break;
                }
            }
        }
    }
    //System.out.println(duplicate);
}
public static void reverseString(String phrase) {
    
    //"The bird is the word"
    
    phrase = phrase + " ";
    String reverseWord = "";
    String word = "";
    
    for(int i = 0; i < phrase.length(); i++){
        char theChar = phrase.charAt(i);
        
        if(theChar != ' '){
            word = word + theChar;
        }
        else {
            reverseWord = word +" "+ reverseWord;
            word = "";
        } 
    }
    System.out.println("Reversed sentence: " + reverseWord);
}
}