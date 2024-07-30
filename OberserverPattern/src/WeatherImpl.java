import java.util.ArrayList;
import java.util.List;

public class WeatherImpl implements Weather {
    private List<Observer> observerList = new ArrayList<Observer>();
    public String weather;

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }
    @Override
    public void notifyObserver(){
        for(Observer observers : observerList){
            observers.update(weather);
        }
    }
    public void setWeather(String weather){
        this.weather = weather;
        notifyObserver();
    }

}
