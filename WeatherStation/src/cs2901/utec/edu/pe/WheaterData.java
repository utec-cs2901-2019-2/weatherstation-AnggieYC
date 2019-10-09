package cs2901.utec.edu.pe;

public class WheaterData implements Subject {


    @Override
    public void registerObserver() {

    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void notifyObservers() {

    }

    public void notifyObserver(){}

    public static WheaterData getTemperature() {
        WheaterData temperature = null;
        return temperature;
    }
    
    public static WheaterData getHumidity() {
        WheaterData humidity = null;
        return humidity;
    }

    public static WheaterData getPressure() {
        WheaterData pressure=null;
        return pressure;
    }



}
