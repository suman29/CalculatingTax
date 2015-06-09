import com.company.OtherCommodities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OtherCommoditiesTest {
    @Test
    public void shouldReturnSamePriceWhenItsGivenNotImported() {
        OtherCommodities other = new OtherCommodities("CD",14.99,false);

        double actualPrice = other.priceOnApplyingTax();
        double expectedPrice = 16.49;

        assertEquals(expectedPrice, actualPrice, 0.05d);
    }

}
