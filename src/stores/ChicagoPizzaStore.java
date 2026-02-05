package stores;
import abstracts.Pizza;
import abstracts.PizzaStore;
import pizzas.ChicagoStyleCheesePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            // There could be other options if matching classes existed

            default -> null;
        };
    }
}
