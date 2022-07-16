package observer.subject;

import observer.observer.Observer;

/**
 * @author vdsklnl
 * @create 2022-07-07 21:13
 * @Description
 */

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
