package game;

import java.util.ArrayList;

public class Game {
    String word;
    Integer attempts = 10;
    ArrayList<Character> guessedLetters = new ArrayList<Character>();

    public Game(WordChooser chooser) {
        // Dependency injection to inject an instance of WordChooser class
        word = chooser.getRandomWordFromDictionary();
       
    }
    public static void main (String[] args) {}

    public String getWordToGuess(){
        StringBuilder sBuilder = new StringBuilder(word);
        
        for (int i = 1; i < word.length(); i++) {
            sBuilder.replace(i, word.length(), "_");
        }
        return sBuilder.toString();
    }

    public Boolean guessLetter(Character letter) {
        if (this.word.indexOf(letter) != -1) {
            guessedLetters.add(letter);
            return true;
        } else {
            // remove one from the number of remaining attempts
            attempts--;
            return false;
        }
    }
  
    public Integer getRemainingAttempts() {
        return Integer.valueOf(attempts);
    }
}


//   // DEBUGGING EXERCISE EXAMPLE
//   public String getWordToGuess() {
//     StringBuilder builder = new StringBuilder(word);

//     for (int i = 0; i < word.length(); i++) {
//         Character currentLetter = word.charAt(0);
//         if (i == 0) {
//             builder.append(currentLetter);
//         } else {
//             builder.append("_");
//         }
//     }
//     return builder.toString();
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

