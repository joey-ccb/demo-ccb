package org.ccb.demo.DesignPattern.Factory.abstractFactory;


import org.ccb.demo.DesignPattern.Factory.common.Sender;

/**
 * Created by cuicb on 2017/4/18.
 */
public class FactoryMain {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
//        Provider provider =  new SendSmsFactory();
        Sender sender = provider.produce();
        sender.Send();


    }
}
