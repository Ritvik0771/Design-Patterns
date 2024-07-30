public class TvDisplay implements Observer{
    private String weather;
    @Override
    public void update(String weather){
        this.weather = weather;
        displayTV();
    }
    public void displayTV(){
        System.out.println("TV Display weather -> " + weather);
    }
}
