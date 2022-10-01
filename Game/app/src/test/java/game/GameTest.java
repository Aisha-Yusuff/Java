package game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class GameTest {
        @Test 
        public void testGetsWordToGuess() {
            WordChooser mockedChooser = mock(WordChooser.class);
            when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

            Game game = new Game(mockedChooser);
            assertEquals(game.getWordToGuess(), "D________");
        }

        @Test
        public void testGetsWordToGuess2() {
            WordChooser mockedChooser = mock(WordChooser.class);
            when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

            Game game = new Game(mockedChooser);
            assertEquals(game.getWordToGuess(), "D________");
        }

        @Test 
        public void testInitialRemainingAttempts() {
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

        @Test
        public void testGuessLetterWrong() {
            WordChooser mockedChooser = mock(WordChooser.class);
            when (mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");

            Game game = new Game(mockedChooser);

            assertEquals(game.guessLetter('Z'), false);
        }

        @Test 
        public void testShouldShowCorrectlyGuessedLetter() {
            WordChooser mockedChooser = mock(WordChooser.class);
            when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

            Game game = new Game(mockedChooser);
            assertEquals(game.guessLetter('E'), true);
            assertEquals(game.getWordToGuess(), "DE_E___E_");
        }

        @Test 
        public void testGuessLetterWrongSoNoChangeToWord() {
            WordChooser mockedChooser = mock(WordChooser.class);
            when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        
            Game game = new Game(mockedChooser);
        
            assertEquals(game.guessLetter('O'), false);
            assertEquals(game.getWordToGuess(), "M_____");
        }

        @Test
        public void testShouldLoseGameIfNoRemainingAttempts() {
            WordChooser mockedChooser = mock(WordChooser.class);
            when(mockedChooser.getRandomWordFromDictionary()).thenReturn("CANDIES");
            
            Game game = new Game(mockedChooser);
            game.guessLetter('O');
            game.guessLetter('O');
            game.guessLetter('O');
            game.guessLetter('O');
            game.guessLetter('O');
            game.guessLetter('O');
            game.guessLetter('O');
            game.guessLetter('O');
            game.guessLetter('O');
            game.guessLetter('O'); 

            assertTrue("Should lose game with no attempts", game.isGameLost());
        }

        @Test
        public void testShouldWinGameIfGuessWordCorrectly() {
            WordChooser mockedChooser = mock(WordChooser.class);
            when(mockedChooser.getRandomWordFromDictionary()).thenReturn("CANDIES");
            
            Game game = new Game(mockedChooser);
            game.guessLetter('A');
            game.guessLetter('N');
            game.guessLetter('D');
            game.guessLetter('I');
            game.guessLetter('E');
            game.guessLetter('S');

            assertTrue("Should win game when word is guessed correctly", game.isGameWon());
        }
    }
    
