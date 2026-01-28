public class Beverage {
    private String description;

    private boolean milk = false;
    private boolean soy = false;
    private boolean mocha = false;
    private boolean whip = false;

    public String getDescription() { return description; }


    public double cost() {
        return (milk ? 0.59 : 0)
                + (soy ? 0.79 : 0)
                + (mocha ? 0.99 : 0)
                + (whip ? 0.69 : 0);
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
