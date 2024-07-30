//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            PhoneDisplay phoneDisplay = new PhoneDisplay();
            TvDisplay tvDisplay = new TvDisplay();

            WeatherImpl weather = new WeatherImpl();
            weather.addObserver(phoneDisplay);
            weather.addObserver(tvDisplay);
            weather.setWeather("Rainy");
            weather.removeObserver(tvDisplay);
            weather.setWeather("Sunny");

    }
}