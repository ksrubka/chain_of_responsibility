package starbucks.ingredients.milk;

import starbucks.ingredients.Order;

import static starbucks.ingredients.CoffeeIngredients.DOUBLE_MILK;
import static starbucks.ingredients.CoffeeIngredients.MILK;
import static starbucks.ingredients.CoffeeIngredients.SOY_MILK;

public class MilkFactory {
    public static AnyMilk create(Order order) {
        if (order.contains(MILK)) {
            return new Milk();
        }
        else if (order.contains(DOUBLE_MILK)) {
            return new DoubleMilk();
        }
        else if (order.contains(SOY_MILK)) {
            return new SoyMilk();
        }
        throw new IllegalArgumentException("Something went wrong while I was adding milk.");
    }
}