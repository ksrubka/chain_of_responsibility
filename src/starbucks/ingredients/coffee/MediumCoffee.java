package starbucks.ingredients.coffee;


import java.math.BigDecimal;

public class MediumCoffee extends Coffee {

    public MediumCoffee() {
        cost = new BigDecimal(6.0);
        name.append("Medium coffee");
    }
}
