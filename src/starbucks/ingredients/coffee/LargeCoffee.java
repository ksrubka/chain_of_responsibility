package starbucks.ingredients.coffee;

import java.math.BigDecimal;

class LargeCoffee extends Coffee {

    LargeCoffee() {
        cost = new BigDecimal(7.0);;
        name.append("Large coffee");
    }
}
