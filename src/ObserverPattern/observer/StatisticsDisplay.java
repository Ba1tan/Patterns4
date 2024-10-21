package ObserverPattern.observer;

public class StatisticsDisplay implements WeatherDisplay {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Statistics: Avg Temp: " + temperature + "C, Humidity: " + humidity + "%");
    }
}
