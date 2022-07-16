package chain.approve;

import chain.request.PurchaseRequest;

/**
 * @author vdsklnl
 * @create 2022-07-11 14:34
 * @Description
 */

public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice()> 30000) {
            System.out.println("请求编号 " + request.getId() + " 已被" + this.name + "处理！");
        } else {
            approver.processRequest(request);
        }
    }
}
