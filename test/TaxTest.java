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

    @Test
    public void shouldBeAbleToParseTheUserInputAndCalculateTaxWhenTheProductIsImportedAndIsAChocolate() {
        Tax tax = new Tax("1 imported chocolate at 11.25");

        double actualTotalTax = tax.parseUserInputAndCalculateTax();
        double expectedTotalTax = 11.85;

        assertEquals(actualTotalTax, expectedTotalTax, 0.05d);
    }

    @Test
    public void shouldBeAbleToParseTheUserInputAndCalculateTaxWhenTheProductIsNotImportedAndIsACD() {
        Tax tax = new Tax("Other Products 1 CD at 14.99");

        double actualTotalTax = tax.parseUserInputAndCalculateTax();
        double expectedTotalTax = 16.49;

        assertEquals(actualTotalTax, expectedTotalTax, 0.05d);
    }
    
}
