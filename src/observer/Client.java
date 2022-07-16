package observer;

import observer.observer.BaiduSite;
import observer.observer.CurrentConditions;
import observer.subject.WeatherData;

/**
 * @author vdsklnl
 * @create 2022-07-08 19:44
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        //原数据对象
        WeatherData weatherData = new WeatherData();
        //观察者
        CurrentConditions conditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        //添加注册
        weatherData.registerObserver(conditions);
        weatherData.registerObserver(baiduSite);

        //显示
        System.out.println("========通知========");
        weatherData.setData(3.0f, 33f, 1.0f);
    }
}
