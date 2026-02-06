package abstracts;

import ingredients.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected  Clams clam;


    protected abstract void prepare();


    protected void bake() {
        System.out.println("Baking for 25 minutes at 350");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    protected void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String veggiesList = veggies != null && veggies.length > 0
                ? Arrays.stream(veggies)
                .map(v -> v.getClass().getSimpleName())
                .collect(Collectors.joining(", "))
                : "none";

        return name + ": \n" +
                "   Dough: " + (dough != null ? dough.getClass().getSimpleName() : "none") + "\n" +
                "   Sauce: " + (sauce != null ? sauce.getClass().getSimpleName() : "none") + "\n" +
                "   Veggies: " + veggiesList + "\n" +
                "   Cheese: " + (cheese != null ? cheese.getClass().getSimpleName() : "none") + "\n" +
                "   Pepperoni: " + (pepperoni != null ? pepperoni.getClass().getSimpleName() : "none") + "\n" +
                "   Clams: " + (clam != null ? clam.getClass().getSimpleName() : "none");
    }
}
