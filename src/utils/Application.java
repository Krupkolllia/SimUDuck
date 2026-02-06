package utils;

import abstracts.Pizza;
import abstracts.PizzaStore;
import stores.ChicagoPizzaStore;

public class Application {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("veggie");
        System.out.println(pizza);
    }
}
