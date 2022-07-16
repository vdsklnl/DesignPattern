package interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author vdsklnl
 * @create 2022-07-09 16:07
 * @Description
 */

public class Calculator {
    //定义表达式
    private Expression expression;

    //构造函数传参
    public Calculator(String expr) {
        Stack<Expression> stack = new Stack<>();
        char[] charArray = expr.toCharArray();

        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        //执行表达式
        return this.expression.interpreter(var);
    }
}
