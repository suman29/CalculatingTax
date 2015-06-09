import com.company.ConsoleInput;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class ConsoleInputTest {
    @Test
    public void checkIfTheUserGivesAnInput() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("1 book at 12.49".getBytes());
        System.setIn(byteArrayInputStream);
        ConsoleInput consoleInput = new ConsoleInput();

        String actualInput = consoleInput.takeUserInputForMainMenu();
        String expectedInput = "1 book at 12.49";

        assertEquals(expectedInput, actualInput);
    }
}
