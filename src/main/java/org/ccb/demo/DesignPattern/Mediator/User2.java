package org.ccb.demo.DesignPattern.Mediator;

/**
 * Created by cuicb on 2017/11/14.
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
