package ObserverPattern;

import ObserverPattern.subject.WeatherStation;
import ObserverPattern.observer.CurrentConditionsDisplay;
import ObserverPattern.observer.StatisticsDisplay;
import ObserverPattern.observer.ForecastDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        station.addObserver(currentDisplay);
        station.addObserver(statisticsDisplay);
        station.addObserver(forecastDisplay);

        station.setWeatherData(25.0, 65.0, 1012.0);
        station.setWeatherData(27.5, 70.0, 1015.0);
    }
}
