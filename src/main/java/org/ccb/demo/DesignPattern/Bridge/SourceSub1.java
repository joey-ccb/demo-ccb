package org.ccb.demo.DesignPattern.Bridge;

/**
 * Created by cuicb on 2017/4/19.
 */
public class SourceSub1 implements Sourceable{
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
