public abstract class Pizza {
    String name;
    String dough;
    String sauce;


    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough: " + dough);
        System.out.println("Adding sauce: " + sauce);
    }

    public void bake() {
        System.out.println("Baking " + name + " for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting " + name + " into slices");
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String getName() {
        return name;
    }
}
