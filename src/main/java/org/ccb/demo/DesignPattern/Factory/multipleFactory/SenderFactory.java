package org.ccb.demo.DesignPattern.Factory.multipleFactory;

import org.ccb.demo.DesignPattern.Factory.common.MailSender;
import org.ccb.demo.DesignPattern.Factory.common.Sender;
import org.ccb.demo.DesignPattern.Factory.common.SmsSender;

/**
 * Created by cuicb on 2017/6/6.
 */
public class SenderFactory {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}
