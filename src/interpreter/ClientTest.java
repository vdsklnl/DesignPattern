package interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author vdsklnl
 * @create 2022-07-09 16:57
 * @Description
 */

public class ClientTest {
    public static void main(String[] args) {
        String expression = null;
        HashMap<String, Integer> var = null;
        try {
            expression = getExpression();
            var = getValue(expression);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Calculator calculator = new Calculator(expression);
        System.out.println("运算结果：" + expression + " = " + calculator.run(var));
    }

    //获取表达式
    public static String getExpression() throws IOException {
        System.out.println("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    //获得值映射
    public static HashMap<String, Integer> getValue(String expression) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();

        for (char ch:expression.toCharArray()) {
            if (ch != '+'&&ch != '-') {
                if (!map.containsKey(ch)) {
                    System.out.print("请输入参数" + String.valueOf(ch) + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }

        return map;
    }
}
