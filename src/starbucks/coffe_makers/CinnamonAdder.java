package starbucks.coffe_makers;


import starbucks.ingredients.Order;

import java.math.BigDecimal;

import static starbucks.ingredients.CoffeeIngredients.CINNAMON;

public class CinnamonAdder extends CoffeeMaker {

    private static final BigDecimal CINNAMON_COST = new BigDecimal(0.5);
    private static final String CINNAMON_NAME = ", cinnamon";

    private CoffeeMaker nextCoffeeMaker;

    @Override
    public void setNextCoffeeMaker(CoffeeMaker coffeeMaker) {
        this.nextCoffeeMaker = coffeeMaker;
    }

    @Override
    public void makeCoffee(Order order) {
        if (order.contains(CINNAMON)) {
            coffee.add(CINNAMON_NAME, CINNAMON_COST);
        }
        nextCoffeeMaker.setCoffe(coffee);
        nextCoffeeMaker.makeCoffee(order);
    }
}
