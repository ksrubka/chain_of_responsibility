package starbucks.coffe_makers;

import starbucks.ingredients.Order;
import starbucks.ingredients.syrup.Syrup;
import starbucks.ingredients.syrup.SyrupFactory;

import static starbucks.ingredients.CoffeeIngredients.CARAMEL_SYRUP;
import static starbucks.ingredients.CoffeeIngredients.COCONUT_SYRUP;
import static starbucks.ingredients.CoffeeIngredients.MAPLE_SYRUP;

public class SyrupAdder extends CoffeeMaker {

    private CoffeeMaker nextCoffeeMaker;

    @Override
    public void setNextCoffeeMaker(CoffeeMaker coffeeMaker) {
        this.nextCoffeeMaker = coffeeMaker;
    }

    @Override
    public void makeCoffee(Order order) {
        if (order.contains(MAPLE_SYRUP) || order.contains(CARAMEL_SYRUP) || order.contains(COCONUT_SYRUP)) {
            Syrup syrup = SyrupFactory.create(order);
            coffee.add(syrup.getName(), syrup.getCost());
        }
        nextCoffeeMaker.setCoffe(coffee);
        nextCoffeeMaker.makeCoffee(order);
    }
}
