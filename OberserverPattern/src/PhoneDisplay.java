public class PhoneDisplay implements Observer{

    private String weather;
    @Override
    public void update(String weather){
        this.weather = weather;
        displayWeather();
    }
    public void displayWeather(){
        System.out.println("Phone displays weather -> " + weather);
    }

}
