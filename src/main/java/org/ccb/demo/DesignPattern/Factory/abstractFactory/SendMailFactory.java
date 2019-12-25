package org.ccb.demo.DesignPattern.Factory.abstractFactory;


import org.ccb.demo.DesignPattern.Factory.common.MailSender;
import org.ccb.demo.DesignPattern.Factory.common.Sender;

/**
 * Created by cuicb on 2017/4/18.
 */
public class SendMailFactory implements Provider{
    @Override
    public Sender produce(){
        return new MailSender();
    }
}
