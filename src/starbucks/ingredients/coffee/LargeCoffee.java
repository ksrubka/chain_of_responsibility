package starbucks.ingredients.coffee;

import java.math.BigDecimal;

public class LargeCoffee extends Coffee {

    public LargeCoffee() {
        cost = new BigDecimal(7.0);;
        name.append("Large coffee");
    }
}
