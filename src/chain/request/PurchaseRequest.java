package chain.request;

/**
 * @author vdsklnl
 * @create 2022-07-11 14:04
 * @Description
 */

public class PurchaseRequest {
    private int id = 0; //请求编号
    private int type = 0; //请求类型
    private float price = 0.0f; //请求金额

    public PurchaseRequest(int id, int type, float price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }
}
