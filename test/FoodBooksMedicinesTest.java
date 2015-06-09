import com.company.FoodBooksMedicines;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.assertEquals;

public class FoodBooksMedicinesTest {
    @Test
    public void shouldReturnSamePriceWhenItsGivenNotImported() {
        FoodBooksMedicines foodBooksMedicines = new FoodBooksMedicines("Chocolate", 0.85, false);

        double actualPrice = foodBooksMedicines.priceOnApplyingTax();
        double expectedPrice = 0.85;

        assertThat(actualPrice, is(expectedPrice));
    }

    @Test
    public void shouldReturnDifferentPriceWhenItsGivenThatItIsImported() {
        FoodBooksMedicines foodBooksMedicines = new FoodBooksMedicines("Chocolate", 11.25, true);

        double actualPrice = foodBooksMedicines.priceOnApplyingTax();
        double expectedPrice = 11.85;

        assertEquals(actualPrice, expectedPrice, 0.05d);
    }

    @Test
    public void shouldReturnProperStringWhenItsGivenThatItIsImported() {
        FoodBooksMedicines foodBooksMedicines = new FoodBooksMedicines("Chocolate", 11.25, true);

        String actualString = foodBooksMedicines.toString();
        String expectedString = "1 imported Chocolate:11.25";

        assertEquals(actualString,expectedString);
    }
}
