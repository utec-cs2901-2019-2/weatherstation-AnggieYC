package cs2901.utec.edu.pe;

public class StatisticsDisplay implements Observer, DisplayElement {

    @Override
    public void update() {

    }
    @Override
    public void display(){
        System.out.printf("M. promedio");
        System.out.printf("M.Min");
        System.out.printf("M. Máx");
    }
}
