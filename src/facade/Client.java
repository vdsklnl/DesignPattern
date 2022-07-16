package facade;

/**
 * @author vdsklnl
 * @create 2022-07-03 20:49
 * @Description 家庭影院仪器调用
 */

public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.end();
    }
}
