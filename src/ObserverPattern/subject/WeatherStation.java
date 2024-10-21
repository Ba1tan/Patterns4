package ObserverPattern.subject;

import ObserverPattern.observer.WeatherDisplay;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherDisplay> observers = new ArrayList<>();
    private double temperature;
    private double humidity;
    private double pressure;

    public void addObserver(WeatherDisplay display) {
        observers.add(display);
    }

    public void removeObserver(WeatherDisplay display) {
        observers.remove(display);
    }

    public void setWeatherData(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherDisplay observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
