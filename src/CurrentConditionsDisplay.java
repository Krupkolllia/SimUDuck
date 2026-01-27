import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;

    Observable observable;


    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData weatherData) {
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
