package org.ccb.demo.DesignPattern.observer;

/**
 * Created by cuicb on 2017/12/20.
 */
public class CitySubject extends AbstractSubject {

    @Override
    public void operation() {
        notifyObservers();
    }
}