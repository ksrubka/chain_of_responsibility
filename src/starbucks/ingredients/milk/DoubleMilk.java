package starbucks.ingredients.milk;

import java.math.BigDecimal;

class DoubleMilk extends AnyMilk {

    DoubleMilk() {
        name = ", double milk";
        cost = new BigDecimal(1.5);
    }
}
