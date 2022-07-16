package builder;

/**
 * @author vdsklnl
 * @create 2022-06-23 12:30
 * @Description
 */

public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("普通房子地基5m");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子墙壁10m");
    }

    @Override
    public void buildRoof() {
        System.out.println("普通房子屋顶");
    }
}
