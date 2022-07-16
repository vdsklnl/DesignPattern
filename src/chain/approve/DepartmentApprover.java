package chain.approve;

import chain.request.PurchaseRequest;

/**
 * @author vdsklnl
 * @create 2022-07-11 14:21
 * @Description
 */

public class DepartmentApprover extends Approver {
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 5000) {
            System.out.println("请求编号 " + request.getId() + " 已被" + this.name + "处理！");
        } else {
            approver.processRequest(request);
        }
    }
}
