package org.ccb.demo.DesignPattern.Mediator;

/**
 * Created by cuicb on 2017/11/14.
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
