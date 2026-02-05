package stores;

import abstracts.Pizza;
import abstracts.PizzaStore;
import pizzas.NYStyleCheesePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> new NYStyleCheesePizza();
            // There could be other options if matching classes existed

            default -> null;
        };
    }
}
