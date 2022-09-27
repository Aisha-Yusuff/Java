package game;

import java.util.Dictionary;
import java.util.Random;

public class Game {
    // When game class is initialize
    // It uses a random word from dictionary to guess
    public Game() {
        getRandomWordFromDictionary();
    }

    public static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
    Integer attempts = 10;
    public static void main (String[] args) {}

    // DEBUGGING EXERCISE EXAMPLE
    public String getsWordToGuess(String word) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            Character currentLetter = word.charAt(0);
            if (i == 0) {
                builder.append(currentLetter);
            } else {
                builder.append("_");
            }
        }
        return builder.toString();
    }

    public Integer getRemainingAttempts() {
        return Integer.valueOf(attempts);
    }

    public String getRandomWordFromDictionary() {
        Random rnd = new Random();
        int index = rnd.nextInt(DICTIONARY.length);
        return DICTIONARY[index];
    }
}

 // SOLUTION VIDEO EXAMPLE - getsWordToGuess

    // public String getsWordToGuess(String word){
    //     StringBuilder sBuilder = new StringBuilder(word);
        
    //     for (int i = 1; i < word.length(); i++) {
    //         sBuilder.replace(i, word.length(), "_");
    //     }
    //     return sBuilder.toString();
    // }


//  MY INITIAL EXAMPLE
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

