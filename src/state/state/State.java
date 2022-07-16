package state.state;

/**
 * @author vdsklnl
 * @create 2022-07-10 16:02
 * @Description 状态接口
 */

public interface State {
    //扣除积分 -50
    public void deductMoney();

    //是否抽取到奖品
    public boolean raffle();

    //发放奖品
    public void dispensePrice();
}
