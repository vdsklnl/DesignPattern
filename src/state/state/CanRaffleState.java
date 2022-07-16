package state.state;

import state.active.RaffleActivity;

import java.util.Random;

/**
 * @author vdsklnl
 * @create 2022-07-10 17:14
 * @Description 可以抽奖状态
 */

public class CanRaffleState implements State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //积分扣除，可以抽奖
    @Override
    public void deductMoney() {
        System.out.println("积分已经扣除，可以开始抽奖~");
    }

    //抽奖，根据实际情况修改状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍后~");
        Random random = new Random();
        int num = random.nextInt(10);
        // 10% 中奖机会
        if (num == 0) {
            activity.setState(activity.getDispense());
            return true;
        } else {
            System.out.println("很遗憾未中奖，下次继续加油！");
            activity.setState(activity.getNoRaffle());
            return false;
        }
    }

    //不能发放奖品
    @Override
    public void dispensePrice() {
        System.out.println("未中奖，不能发放奖品！");
    }
}
