// There is a modern better way to create the Singleton:
/*
    public class ChocolateBoiler {
        private ChocolateBoiler() { }

        private static class Holder {
            static final ChocolateBoiler INSTANCE = new ChocolateBoiler();
        }


        public ChocolateBoiler getInstance() {
            return Holder.INSTANCE;
        }
    }
    ...
 */


public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static volatile ChocolateBoiler instance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            synchronized (ChocolateBoiler.class) {
                if (instance == null) {
                    instance = new ChocolateBoiler();
                }
            }
        }

        return instance;
    }


    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
