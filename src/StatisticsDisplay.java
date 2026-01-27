import java.util.*;

@SuppressWarnings("deprecation")
public class StatisticsDisplay implements DisplayElement, Observer {
    private List<Float> temperatures = new ArrayList<>();

    private float averageTemperature;
    private float minTemperature;
    private float maxTemperature;

    Observable observable;


    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Average/Min/Max temperature: "
                + averageTemperature + "/"
                + minTemperature + "/"
                + maxTemperature);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData weatherData) {
            this.temperatures.add(weatherData.getTemperature());
            this.averageTemperature = (float) temperatures.stream()
                    .mapToDouble(Float::doubleValue)
                    .average()
                    .orElse(0.0f);
            this.minTemperature = Collections.min(temperatures);
            this.maxTemperature = Collections.max(temperatures);
            display();
        }
    }
}


