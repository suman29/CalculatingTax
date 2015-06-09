import com.company.FoodBooksMedicines;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ConsoleOutputTest {
    @Test
    public void shouldPrintTheProductWithPriceInProperFormat() {
        FoodBooksMedicines productStub = mock(FoodBooksMedicines.class);
        when(productStub.toString())
                .thenReturn("1 imported Chocolate:11.25");

    }
}
