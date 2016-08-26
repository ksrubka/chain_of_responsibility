package starbucks.coffe_makers;

import starbucks.ingredients.Order;
import starbucks.ingredients.coffee.Coffee;

public abstract class CoffeeMaker {

    protected Coffee coffee;

    public abstract void setNextCoffeeMaker(CoffeeMaker coffeeMaker);

    public abstract void makeCoffee(Order order);

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffe(Coffee coffe) {
        this.coffee = coffe;
    }
}
