package chain.approve;

import chain.request.PurchaseRequest;

/**
 * @author vdsklnl
 * @create 2022-07-11 14:10
 * @Description
 */

public abstract class Approver {
    Approver approver; //下一个处理人
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理请求的方法
    public abstract void processRequest(PurchaseRequest request);

}
