package state.state;

import state.active.RaffleActivity;

/**
 * @author vdsklnl
 * @create 2022-07-10 16:23
 * @Description 不能抽奖状态
 */

public class NoRaffleState implements State {

    //传入相应活动以改变其状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //当前状态可以扣积分，扣除后，将状态设为可以抽奖
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，可以开始抽奖！");
        activity.setState(activity.getCanRaffle());
    }

    //当前状态无法抽奖
    @Override
    public boolean raffle() {
        System.out.println("参与抽奖需要50积分哦~");
        return false;
    }

    //当前状态不能发放奖品
    @Override
    public void dispensePrice() {
        System.out.println("无法发放奖品，请重试！");
    }
}
