package ObserverPattern.observer;

public class ForecastDisplay implements WeatherDisplay {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Forecast: Temp: " + temperature + "C, Pressure: " + pressure + "hPa");
    }
}
