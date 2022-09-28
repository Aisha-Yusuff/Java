package game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class GameTest {
        @Test public void testGetsWordToGuess() {
            WordChooser mockedChooser = mock(WordChooser.class);
            when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

            Game game = new Game(mockedChooser);
            String word = "B_____";
            assertEquals(game.getWordToGuess(), "B_____");
        }

        @Test public void testGetsWordToGuess2() {
            WordChooser mockedChooser = mock(WordChooser.class);
            when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

            Game game = new Game(mockedChooser);
            String word = "MAKERS";
            assertEquals(game.getWordToGuess(), "M_____");
        }

        @Test public void testInitialRemainingAttempts() {
            WordChooser mockedChooser = mock(WordChooser.class);
            when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

            Game game = new Game(mockedChooser);
            assertEquals(game.getRemainingAttempts(), Integer.valueOf(10) );
        }

        @Test
        public void testGetsWordToGuessWithRandomWord() {
            WordChooser mockedChooser = mock(WordChooser.class);
            when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

            Game game = new Game(mockedChooser);

            assertEquals(game.getWordToGuess(), "D________");
        }

    }
    
