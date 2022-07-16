package builder;

/**
 * @author vdsklnl
 * @create 2022-06-23 12:33
 * @Description
 */

public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("高楼地基50m");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼墙壁100m");
    }

    @Override
    public void buildRoof() {
        System.out.println("高楼屋顶");
    }
}
