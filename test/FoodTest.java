import com.company.Food;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.assertEquals;

public class FoodTest {
    @Test
    public void shouldReturnSamePriceWhenItsGivenNotImported() {
        Food food = new Food("Chocolate", 0.85, false);

        double actualPrice = food.priceOnApplyingTax();
        double expectedPrice = 0.85;

        assertThat(actualPrice, is(expectedPrice));
    }

    @Test
    public void shouldReturnDifferentPriceWhenItsGivenThatItIsImported() {
        Food food = new Food("Chocolate", 11.25, true);

        double actualPrice = food.priceOnApplyingTax();
        double expectedPrice = 11.85;

        assertEquals(actualPrice, expectedPrice, 0.05d);
    }
}
