public class Main {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new PizzaFactory());
        Pizza pizza = store.orderPizza("clam");
    }
}
