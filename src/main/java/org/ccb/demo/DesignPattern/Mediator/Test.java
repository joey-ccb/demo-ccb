package org.ccb.demo.DesignPattern.Mediator;

/**
 * Created by cuicb on 2017/11/14.
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
