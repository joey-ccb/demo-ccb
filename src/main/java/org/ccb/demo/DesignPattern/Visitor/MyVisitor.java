package org.ccb.demo.DesignPattern.Visitor;

/**
 * Created by cuicb on 2017/11/14.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject：" + sub.getSubject());
    }
}
