package prototype.shallow;

/**
 * @author vdsklnl
 * @create 2022-06-21 15:59
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Tom", 1, "white");
        sheep.setFriend(new Sheep("Jerry", 1, "black"));
        //浅拷贝，引用类型变量直接指向该对象，修改会相互影响
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
    }
}
