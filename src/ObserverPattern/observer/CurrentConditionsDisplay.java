package ObserverPattern.observer;

public class CurrentConditionsDisplay implements WeatherDisplay {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Current Conditions: " + temperature + "C degrees and " + humidity + "% humidity");
    }
}
