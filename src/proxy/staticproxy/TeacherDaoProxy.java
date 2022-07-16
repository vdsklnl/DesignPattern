package proxy.staticproxy;

/**
 * @author vdsklnl
 * @create 2022-07-04 21:48
 * @Description
 */

public class TeacherDaoProxy implements ITeacherDao {
    //代理类
    private ITeacherDao target; //目标对象，接口聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理");
        target.teach();
        System.out.println("提交");
    }
}
