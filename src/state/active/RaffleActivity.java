package state.active;

import state.state.*;

/**
 * @author vdsklnl
 * @create 2022-07-10 16:26
 * @Description
 */

public class RaffleActivity {
    //状态，奖品数量
    State state = null;
    int count = 0;

    //四种状态
    State canRaffle = new CanRaffleState(this);
    State noRaffle = new NoRaffleState(this);
    State dispense = new DispenseState(this);
    State dispenseOut = new DispenseOutState(this);

    public State getState() {
        return state;
    }

    public void setCanRaffle(State canRaffle) {
        this.canRaffle = canRaffle;
    }

    public void setNoRaffle(State noRaffle) {
        this.noRaffle = noRaffle;
    }

    public void setDispense(State dispense) {
        this.dispense = dispense;
    }

    public void setDispenseOut(State dispenseOut) {
        this.dispenseOut = dispenseOut;
    }

    public int getCount() {
        return count--;
    }

    public State getCanRaffle() {
        return canRaffle;
    }

    public State getNoRaffle() {
        return noRaffle;
    }

    public State getDispense() {
        return dispense;
    }

    public State getDispenseOut() {
        return dispenseOut;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public RaffleActivity(int count) {
        this.state = getNoRaffle();
        this.count = count;
    }

    //调用当前状态，扣除积分
    public void deductMoney() {
        this.state.deductMoney();
    }

    //抽奖成功，则去领奖
    public void raffle() {
        if (state.raffle()) {
            state.dispensePrice();
        }
    }

}
