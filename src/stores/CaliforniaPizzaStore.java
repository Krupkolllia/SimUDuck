package stores;

import abstracts.Pizza;
import abstracts.PizzaStore;
import pizzas.CaliforniaStyleCheesePizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> new CaliforniaStyleCheesePizza();
            // There could be other options if matching classes existed

            default -> null;
        };
    }
}
