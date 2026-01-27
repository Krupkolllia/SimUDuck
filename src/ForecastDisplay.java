import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class ForecastDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    Observable observable;


    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        //To be implemented
        System.out.println("Forecast: Nice weather!");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData weatherData) {
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();

            display();
        }
    }
}
