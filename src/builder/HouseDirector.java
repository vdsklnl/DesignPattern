package builder;

/**
 * @author vdsklnl
 * @create 2022-06-23 12:35
 * @Description
 */

public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //定义修建流程并返回产品
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }
}
