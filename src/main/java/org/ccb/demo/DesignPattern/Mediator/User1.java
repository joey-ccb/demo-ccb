package org.ccb.demo.DesignPattern.Mediator;

/**
 * Created by cuicb on 2017/11/14.
 */
public class User1 extends User{
    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
