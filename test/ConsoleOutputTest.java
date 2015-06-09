import com.company.Tax;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import static org.mockito.Mockito.when;

public class ConsoleOutputTest {
    @Test
    public void shouldPrintTheProductWithPriceInProperFormat() {
       Tax taxStub = mock(Tax.class);
        when(taxStub.parseUserInputAndCalculateTax())
                .thenReturn(0.85);
        Tax tax = new Tax("1 chocolate at 0.85");

        double actualTotalTax = tax.parseUserInputAndCalculateTax();
        double expectedTotalTax = 0.85;

        assertEquals(actualTotalTax,expectedTotalTax, 0.05d);

    }
}
