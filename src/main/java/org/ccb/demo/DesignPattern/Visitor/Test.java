package org.ccb.demo.DesignPattern.Visitor;

/**
 * Created by cuicb on 2017/11/14.
 */
public class Test {

    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
