package game;

public class Game {
    public static void main (String[] args) {


    }
    public String getsWordToGuess(String word){
        StringBuilder sBuilder = new StringBuilder(word);
        
        for (int i = 1; i < word.length(); i++) {
            sBuilder.replace(i, word.length(), "_");
        }
        return sBuilder.toString();
    }

    }

    // Using .charAt to show the first character of word
       // Parametrized constructor
        // String word;
        // Game(String answer) {
        //     word = answer;
        // }
        // public static void main (String[] args) {}
    
        // public String getsWordToGuess(){
        // char firstChar = word.charAt(0);
        // return firstChar + "_____";
        // }

