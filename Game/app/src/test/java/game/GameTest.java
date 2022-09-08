package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
        @Test public void testGetsWordToGuess() {
            Game game = new Game();
            String word = "B_____";
            assertEquals(game.getsWordToGuess(word), "B_____");
        }

        @Test public void testGetsWordToGuess2() {
            Game game = new Game();
            String word = "MAKERS";
            assertEquals(game.getsWordToGuess(word), "M_____");
        }
    }
    
