package org.ccb.demo.DesignPattern.Visitor;

/**
 * Created by cuicb on 2017/11/14.
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
