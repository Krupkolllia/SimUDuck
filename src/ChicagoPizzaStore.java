public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            // There could be other options if matching classes existed

            default -> null;
        };
    }
}
