package starbucks.ingredients.coffee;


import java.math.BigDecimal;

class MediumCoffee extends Coffee {

    MediumCoffee() {
        cost = new BigDecimal(6.0);
        name.append("Medium coffee");
    }
}
