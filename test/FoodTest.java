import com.company.Food;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;

public class FoodTest {
    @Test
    public void shouldReturnSamePriceWhenItsGivenNotImported() {
        Food food = new Food("Chocolate",0.85,false);

        double actualPrice = food.priceOnApplyingTax();
        double expectedPrice = 0.85;

        assertThat(actualPrice,is(expectedPrice));
    }
}
