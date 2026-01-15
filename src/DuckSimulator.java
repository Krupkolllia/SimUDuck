public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck model = new ModelDuck();

        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
