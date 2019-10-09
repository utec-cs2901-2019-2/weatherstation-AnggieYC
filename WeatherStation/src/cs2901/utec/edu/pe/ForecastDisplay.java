package cs2901.utec.edu.pe;

public class ForecastDisplay implements Observer, DisplayElement {
    @Override
    public void update() {

    }
    @Override
    public void display(){
        System.out.printf("Pronóstico del tiempo");
    }
}
