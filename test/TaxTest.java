import com.company.Tax;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxTest {
    @Test
    public void shouldBeAbleToParseTheUserInputAndCalculateTaxWhenTheProductIsNotImportedAndIsABook() {
        Tax tax = new Tax("1 book at 12.49");

        double actualTotalTax = tax.parseUserInputAndCalculateTax();
        double expectedTotalTax = 12.49;

        assertEquals(actualTotalTax, expectedTotalTax, 0.05d);
    }
}
