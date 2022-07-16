package flyweight;

import java.util.HashMap;

/**
 * @author vdsklnl
 * @create 2022-07-04 20:54
 * @Description
 */

public class WebsiteFactory {
    //网站工厂类，根据需要返回对应网站

    //集合，充当网站池的作用
    private HashMap<String, Website> pool = new HashMap<>();

    //根据网站类型返回网站，若无则先创建加入池再返回
    public Website getWebsite(String type) {
        if (!pool.containsKey(type))
            pool.put(type, new ConcreteWebsite(type));
        return (Website) pool.get(type);
    }

    //获取网站分类总数(池容量)
    public int getNum() {
        return pool.size();
    }
}
