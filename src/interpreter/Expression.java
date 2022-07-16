package interpreter;

import java.util.HashMap;

/**
 * @author vdsklnl
 * @create 2022-07-09 15:44
 * @Description
 */

public abstract class Expression {
    //解释公式，String为变量，Integer为具体值
    public abstract int interpreter(HashMap<String, Integer> var);
}
