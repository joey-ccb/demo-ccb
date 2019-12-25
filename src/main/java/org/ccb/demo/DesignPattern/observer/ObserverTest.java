package org.ccb.demo.DesignPattern.observer;


/**
 * Created by cuicb on 2017/12/20.
 */
public class ObserverTest {
    public static void main(String[] args) {

        Subject sub = new CitySubject();
        sub.add(new CityObserver(2101));
        sub.operation();
    }

}
