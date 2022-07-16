package interpreter;

import java.util.HashMap;

/**
 * @author vdsklnl
 * @create 2022-07-09 16:00
 * @Description 运算符号解释器，与左右数字有关，均为Expression子类
 */

public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //默认实现，由子类实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
