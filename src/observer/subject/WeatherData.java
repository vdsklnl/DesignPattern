package observer.subject;

import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vdsklnl
 * @create 2022-07-07 21:22
 * @Description
 */

public class WeatherData implements Subject {

    //温度、气压、湿度
    private float temperature;
    private float pressure;
    private float humidity;
    //观察者集合
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    private void dataChange() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o))
            observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature, this.pressure, this.humidity);
        }
    }
}
