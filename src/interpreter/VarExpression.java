package interpreter;

import java.util.HashMap;

/**
 * @author vdsklnl
 * @create 2022-07-09 15:46
 * @Description 变量解释器
 */

public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
