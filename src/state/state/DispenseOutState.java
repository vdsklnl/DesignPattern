package state.state;

import state.active.RaffleActivity;

/**
 * @author vdsklnl
 * @create 2022-07-10 20:37
 * @Description 奖品发放完毕状态，抽奖活动结束
 */

public class DispenseOutState implements State {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("活动结束啦，下次早些参与吧~~~");
    }

    @Override
    public boolean raffle() {
        System.out.println("活动结束啦，下次早些参与吧~~~");
        return false;
    }

    @Override
    public void dispensePrice() {
        System.out.println("活动结束啦，下次早些参与吧~~~");
    }
}
