package stores;
import abstracts.Pizza;
import abstracts.PizzaStore;
import factories.ChicagoPizzaIngredientFactory;
import factories.PizzaIngredientFactory;
import pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        Pizza pizza = switch (type.toLowerCase()) {
            case "cheese" -> new CheesePizza(ingredientFactory);
            case "clam" -> new ClamPizza(ingredientFactory);
            case "veggie" -> new VeggiePizza(ingredientFactory);
            case "greek" -> new GreekPizza(ingredientFactory);
            case "pepperoni" -> new PepperoniPizza(ingredientFactory);
            default -> throw new IllegalArgumentException("Unknown pizza type: " + type);
        };

        pizza.setName("Chicago Style " + pizza.getClass().getSimpleName().replace("Pizza", "") + " Pizza");
        return pizza;

    }
}
