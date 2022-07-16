package chain.approve;

import chain.request.PurchaseRequest;

/**
 * @author vdsklnl
 * @create 2022-07-11 14:26
 * @Description
 */

public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() > 5000&&request.getPrice() <= 10000) {
            System.out.println("请求编号 " + request.getId() + " 已被" + this.name + "处理！");
        } else {
            approver.processRequest(request);
        }
    }
}
