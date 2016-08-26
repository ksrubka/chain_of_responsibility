package starbucks.ingredients.milk;

import java.math.BigDecimal;

class SoyMilk extends AnyMilk {
    SoyMilk() {
        name = ", milk";
        cost = new BigDecimal(1.5);
    }
}