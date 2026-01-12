public class Main {
    public static void main(String[] args) {
        var fly = new FlyWithWings();
        var quack = new Quack();

        var mallardDuck = new MallardDuck(fly, quack);

        mallardDuck.display();
        mallardDuck.flyBehavior.fly();
        mallardDuck.makingSoundBehavior.makeSound();
    }
}
