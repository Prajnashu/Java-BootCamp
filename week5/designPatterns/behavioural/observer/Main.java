package week5.designPatterns.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        //The subject
        WeatherData weatherData = new WeatherData();

        //Two observers connected to the subject
        CurrentConditionsDisplay currentDisplay =
            new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay currentDisplay2 = new CurrentConditionsDisplay(weatherData);

        //Since the two observers will be notified, the changes will be printed twice.
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
