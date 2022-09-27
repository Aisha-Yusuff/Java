package game;

public class Game {
    String word;

    public Game(WordChooser chooser) {
        // Dependency injection to inject an instance of WordChooser class
        word = chooser.getRandomWordFromDictionary();
       
    }

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

