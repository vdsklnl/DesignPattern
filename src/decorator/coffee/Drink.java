package decorator.coffee;

/**
 * @author vdsklnl
 * @create 2022-06-29 10:57
 * @Description
 */

public abstract class Drink {
    public String des; //描述
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用方法，子类实现，递归调用
    public abstract float cost();
}
