package abstracts;

import ingredients.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;


    protected abstract void prepare();


    protected void bake() {
        System.out.println("Baking for 25 minutes at 350");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    protected void box() {
        System.out.println("Place pizza in official abstracts.PizzaStore box");
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
                .map(Object::toString)
                .collect(Collectors.joining(", "))
                : "none";

        return name + ": \n" +
                "Dough: " + dough + "\n" +
                "Sauce: " + sauce + "\n" +
                "Veggies: " + veggiesList + "\n" +
                "Cheese: " + cheese + "\n" +
                "Pepperoni: " + pepperoni + "\n" +
                "Clams: " + clam;
    }
}
