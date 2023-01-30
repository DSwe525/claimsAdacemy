package Practice;

public class PracticeLoops {
    
    public static void main(String[] args) {

        alphabet();
        }
    
    public static void alphabet() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < alphabet.length(); i++) {
        
            if(alphabet.charAt(i) == ('a') || alphabet.charAt(i) == ('e') || 
            alphabet.charAt(i) == ('i') || alphabet.charAt(i) == ('o') || 
            alphabet.charAt(i) == ('u'))  {
                System.out.print(alphabet.charAt(i));
            }
        }
    }

    public static void reverse() {
        String sentence = "until";

        String reverseSentence = "";

        for(int i = sentence.length()-1; i >= 0; i--) {

        reverseSentence = reverseSentence + sentence.charAt(i);
    }
  System.out.println(reverseSentence);
}

}
    

  

