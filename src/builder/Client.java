package builder;

/**
 * @author vdsklnl
 * @create 2022-06-23 12:38
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        //测试
        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        House house = houseDirector.constructHouse();
        System.out.println("========================");
        houseDirector.setHouseBuilder(new HighBuilding());
        House house1 = houseDirector.constructHouse();
    }
}
