public abstract class PizzaStore {
    PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }


    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
