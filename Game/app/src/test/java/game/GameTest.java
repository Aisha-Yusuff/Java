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
            assertEquals(game.getWordToGuess(), "D________");
        }

        @Test public void testGetsWordToGuess2() {
            WordChooser mockedChooser = mock(WordChooser.class);
            when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

            Game game = new Game(mockedChooser);
            assertEquals(game.getWordToGuess(), "D________");
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

        @Test 
        public void testGuessLetterRightAndDisplayLetter() {
            WordChooser mockedChooser = mock(WordChooser.class);
            when (mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");

            Game game = new Game(mockedChooser);

            assertEquals(game.guessLetter('A'), true);
        }

    }
    
