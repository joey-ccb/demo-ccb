package org.ccb.demo.DesignPattern.Factory.staticFactory;


import org.ccb.demo.DesignPattern.Factory.common.MailSender;
import org.ccb.demo.DesignPattern.Factory.common.Sender;
import org.ccb.demo.DesignPattern.Factory.common.SmsSender;

/**
 * Created by cuicb on 2017/6/6.
 */
public class SenderFactory {
    public static Sender produceMail(){
        return new MailSender();
    }
    public static Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        Sender sender = SenderFactory.produceMail();
        sender.Send();
    }
}
