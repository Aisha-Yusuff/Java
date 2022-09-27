package game;

import java.util.Random;

public class WordChooser {
    public static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
    public static void main(String[] args) {

    };

    public String getRandomWordFromDictionary() {
        Random rnd = new Random();
        int index = rnd.nextInt(DICTIONARY.length);
        return DICTIONARY[index];
    }
}
