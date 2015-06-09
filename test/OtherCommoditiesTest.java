import com.company.OtherCommodities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OtherCommoditiesTest {
    @Test
    public void shouldReturnPriceWhenItsGivenNotImported() {
        OtherCommodities other = new OtherCommodities("CD", 14.99, false);

        double actualPrice = other.priceOnApplyingTax();
        double expectedPrice = 16.49;

        assertEquals(expectedPrice, actualPrice, 0.05d);
    }

    @Test
    public void shouldReturnMorePriceWhenItsGivenImported() {
        OtherCommodities other = new OtherCommodities("CD", 47.50, true);

        double actualPrice = other.priceOnApplyingTax();
        double expectedPrice = 54.86;

        assertEquals(expectedPrice, actualPrice, 0.05d);
    }
}
