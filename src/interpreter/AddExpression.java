package interpreter;

import java.util.HashMap;

/**
 * @author vdsklnl
 * @create 2022-07-09 16:03
 * @Description 加法解释器
 */

public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
