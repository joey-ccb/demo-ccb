package org.ccb.demo.DesignPattern.Bridge;

/**
 * Created by cuicb on 2017/4/19.
 */
public class MyBridge extends Bridge {

    @Override
    public void method() {
        getSource().method();
    }
}
