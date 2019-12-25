package org.ccb.demo.DesignPattern.Visitor;

/**
 * Created by cuicb on 2017/11/14.
 */
public interface Subject {
    public void accept(Visitor visitor);

    public String getSubject();
}
