package org.ccb.demo.DesignPattern.Factory.ordinaryFactory;

import org.ccb.demo.DesignPattern.Factory.common.MailSender;
import org.ccb.demo.DesignPattern.Factory.common.Sender;
import org.ccb.demo.DesignPattern.Factory.common.SmsSender;

/**
 * Created by cuicb on 2017/6/6.
 */
public class SenderFactory {

    public Sender produce(String type) {
        switch (type) {
            case "mail":
                return new MailSender();
            case "sms":
                return new SmsSender();
            default:
                System.out.println("请输入正确的类型!");
                return null;
        }
    }

    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produce("mail");
        sender.Send();
    }
}
