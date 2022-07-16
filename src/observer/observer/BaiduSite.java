package observer.observer;

/**
 * @author vdsklnl
 * @create 2022-07-08 19:49
 * @Description
 */

public class BaiduSite implements Observer {
    //温度、气压、湿度
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("======百度网站======");
        System.out.println("Temperature:" + temperature);
        System.out.println("Pressure:" + pressure);
        System.out.println("Humidity:" + humidity);
    }
}
