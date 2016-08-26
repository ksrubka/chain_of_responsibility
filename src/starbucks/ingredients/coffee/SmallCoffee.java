package starbucks.ingredients.coffee;

import java.math.BigDecimal;

class SmallCoffee extends Coffee {

    SmallCoffee() {
        cost = new BigDecimal(5.0);
        name.append("Small coffee");
    }
}
