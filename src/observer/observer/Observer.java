package observer.observer;

/**
 * @author vdsklnl
 * @create 2022-07-07 21:14
 * @Description
 */

public interface Observer {
    public void update(float temperature, float pressure, float humidity);
}
