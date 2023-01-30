package LabProject3;

import java.util.*;

public class Lab3 {
    
    public static void main(String[] args) {
 
        String info = "The lazy fox jumped over the lazy dog";   
        //char str[] = info.toCharArray();  
        //int len = str.length;   
        repeatedCharacters();
    }

    public static void remove() {

        String word = "Average";
        String newWord = word.replace("a" + "v", "");
        System.out.print(newWord);
                
        }

    public static void duplicates(char str[], int length) {

        int index = 0;
        for (int i = 0; i < length; i++) {
            int j;
            for (j = + 1 ; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            if (j == i) {
                str[index++] = str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));
    }
    public static void countNumber() {

        String word = "Alabama";
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ('a') || word.charAt(i) == ('e') || 
            word.charAt(i) == ('i') || word.charAt(i) == ('o') || 
            word.charAt(i) == ('u') || word.charAt(i) == ('A') || word.charAt(i) == ('E') || 
            word.charAt(i) == ('I') || word.charAt(i) == ('O') || 
            word.charAt(i) == ('U')) {
                vowels++;
            }
            else {
                consonants++;
            }
            }
        System.out.println("Number of vowels: "+ vowels);
        System.out.println("Number of consonants: " + consonants);
    }

    public static void repeatedCharacters() {

        String word = "morning";
        String duplicate = "";
        boolean foundDupe = false;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1 ; j < word.length(); j++) {
                
                if (word.charAt(i) == word.charAt(j)) {
                    duplicate = duplicate.concat(Character.toString(word.charAt(j)));
                        if (!foundDupe) {
                            duplicate = duplicate.concat(Character.toString(word.charAt(i)));
                            foundDupe = true;
                            break;
                        }
                    
        }
        
    }
}
        for (char letters : duplicate.toCharArray()); {
            word = word.replaceAll(Character.toString(letters), "");
    }
    System.out.println("The new word is : " + word + duplicate);
}
}