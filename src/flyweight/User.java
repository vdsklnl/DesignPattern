package flyweight;

/**
 * @author vdsklnl
 * @create 2022-07-04 21:05
 * @Description
 */

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
