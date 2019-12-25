package org.ccb.demo.DesignPattern.Factory.common;

/**
 * Created by cuicb on 2017/4/18.
 */
public class SmsSender implements Sender{
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
