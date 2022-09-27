package game;

import java.util.Random;

public class WordChooser {
    public static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

    public String getRandomWordFromDictionary() {
        Random rnd = new Random();

         // one line example
        // return DICTIONARY[rnd.nextInt(DICTIONARY.length)];
        int index = rnd.nextInt(DICTIONARY.length);
        return DICTIONARY[index];
    }
}
