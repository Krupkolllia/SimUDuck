abstract class Duck {
    protected final FlyBehavior flyBehavior;
    protected final MakingSoundBehavior makingSoundBehavior;

    public Duck(FlyBehavior flyBehavior, MakingSoundBehavior makingSoundBehavior) {
        this.flyBehavior = flyBehavior;
        this.makingSoundBehavior = makingSoundBehavior;
    }

    void display() {
        System.out.println(this.getClass().getName() + " displays");
    }
}
