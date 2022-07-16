package state;

import state.active.RaffleActivity;

/**
 * @author vdsklnl
 * @create 2022-07-10 21:16
 * @Description
 */

public class ClientTest {
    public static void main(String[] args) {
        RaffleActivity raffleActivity = new RaffleActivity(1);

        for (int i = 0; i < 30; i++) {
            System.out.println("-----第" + (i + 1) + "次抽奖-----");
            raffleActivity.deductMoney();
            raffleActivity.raffle();
        }
    }
}
