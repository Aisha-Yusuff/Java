/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package getpricelabel;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void appDisplaysItemAndPrice() {
        App classUnderTest = new App ();
        assertEquals("app should return item name and it's price", String.valueOf("The price for item: chocolate is £2"), classUnderTest.getPriceLabel("chocolate", 2));
    }
}
