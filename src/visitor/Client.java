package visitor;

import visitor.action.Action;
import visitor.action.Fail;
import visitor.action.Success;
import visitor.action.Wait;
import visitor.label.Man;
import visitor.label.Woman;
import visitor.structure.ObjectStructure;

/**
 * @author vdsklnl
 * @create 2022-07-06 21:30
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        Action success = new Success();
        objectStructure.display(success);
        System.out.println("===============");
        Action fail = new Fail();
        objectStructure.display(fail);
        System.out.println("===============");
        Action wait = new Wait();
        objectStructure.display(wait);
    }
}
