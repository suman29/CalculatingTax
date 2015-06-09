import com.company.ComputeTaxMultipleItems;
import com.company.Tax;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ComputeTaxMultipleItemsTest {
    @Test
    public void shouldComputeOverAllTax() {
        ArrayList<Tax> products = new ArrayList<>();

        products.add(new Tax("1 book at 11.2"));
        products.add(new Tax("1 imported chocolate at 10.0"));

        ComputeTaxMultipleItems multipleProduct = new ComputeTaxMultipleItems(products);

        double actualTotalTax = multipleProduct.getTotalTax();
        double expectedTotalTax = 21.70;

        assertEquals(actualTotalTax, expectedTotalTax, 0.05d);

    }
}
