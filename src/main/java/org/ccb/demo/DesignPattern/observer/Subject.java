package org.ccb.demo.DesignPattern.observer;

/**
 * Created by cuicb on 2017/12/20.
 */
public interface Subject {
    /*增加观察者*/
    void add(Observer observer);

    /*删除观察者*/
    void del(Observer observer);

    /*通知所有的观察者*/
    void notifyObservers();

    /*自身的操作*/
    void operation();
}
