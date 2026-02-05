public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore(PizzaFactory factory) {
        super(factory);
    }

    @Override
    Pizza createPizza(String type) {
        return null;
    }
}
