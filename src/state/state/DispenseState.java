package state.state;

import state.active.RaffleActivity;

/**
 * @author vdsklnl
 * @create 2022-07-10 20:30
 * @Description 发放奖品状态
 */

public class DispenseState implements State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("此时不能扣除积分哦~");
    }

    @Override
    public boolean raffle() {
        System.out.println("此时不能抽奖哦~");
        return false;
    }

    @Override
    public void dispensePrice() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖！");
            activity.setState(activity.getNoRaffle());
        } else {
            System.out.println("来晚了哦，奖品已经没有了QAQ");
            activity.setState(activity.getDispenseOut());
            System.out.println("抽奖活动结束，谢谢大家的积极参与！！！");
            System.exit(0);
        }
    }
}
