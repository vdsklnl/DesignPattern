package flyweight;

/**
 * @author vdsklnl
 * @create 2022-07-04 21:01
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();
        Website website1 = factory.getWebsite("新闻");
        website1.use(new User("Tom"));
        Website website2 = factory.getWebsite("娱乐");
        website2.use(new User("Jerry"));
        Website website3 = factory.getWebsite("娱乐");
        website3.use(new User("Thomas"));
        System.out.println(factory.getNum());
    }
}
