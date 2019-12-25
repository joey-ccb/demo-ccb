package org.ccb.demo.DesignPattern.state;

/**
 * Created by cuicb on 2018/2/9.
 */
public class CyanOrange implements Orange {

    @Override
    public void printColor() {
        System.out.println("My color is cyan!");
    }
}