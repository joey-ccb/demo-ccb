package org.ccb.demo.DesignPattern.Interpreter;

/**
 * Created by cuicb on 2017/11/14.
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
