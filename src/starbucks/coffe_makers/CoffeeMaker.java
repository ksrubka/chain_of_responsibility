package starbucks.coffe_makers;

import starbucks.ingredients.Order;
import starbucks.ingredients.coffee.Coffee;

public abstract class CoffeeMaker {

    protected Coffee coffee;

    public Coffee getCoffee() {
        return coffee;
    }

    void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract void setNextCoffeeMaker(CoffeeMaker coffeeMaker);
    public abstract void makeCoffee(Order order);
}
