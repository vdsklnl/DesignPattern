package builder;

/**
 * @author vdsklnl
 * @create 2022-06-23 11:32
 * @Description
 */

public abstract class HouseBuilder {
    protected House house = new House();

    //建造方法，抽象
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoof();

    //返回修建好的房子
    public House buildHouse() {
        return house;
    }
}
