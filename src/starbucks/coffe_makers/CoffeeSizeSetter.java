package starbucks.coffe_makers;

import starbucks.ingredients.Order;
import starbucks.ingredients.coffee.CoffeeFactory;

import static starbucks.ingredients.CoffeeIngredients.LARGE_COFFEE;
import static starbucks.ingredients.CoffeeIngredients.MEDIUM_COFFEE;
import static starbucks.ingredients.CoffeeIngredients.SMALL_COFFEE;

public class CoffeeSizeSetter extends CoffeeMaker {

    private CoffeeMaker nextCoffeeMaker;

    @Override
    public void setNextCoffeeMaker(CoffeeMaker coffeeMaker) {
        this.nextCoffeeMaker = coffeeMaker;
    }

    @Override
    public void makeCoffee(Order order) {
        if (order.contains(SMALL_COFFEE) ||
                order.contains(MEDIUM_COFFEE) || order.contains(LARGE_COFFEE)) {
            coffee = CoffeeFactory.create(order);
            nextCoffeeMaker.setCoffe(coffee);
            nextCoffeeMaker.makeCoffee(order);
        }
        else {
            System.out.println("Coffee size not specified.");
        }
    }
}
