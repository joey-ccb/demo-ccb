package org.ccb.demo.DesignPattern.Factory.abstractFactory;

import org.ccb.demo.DesignPattern.Factory.common.Sender;
import org.ccb.demo.DesignPattern.Factory.common.SmsSender;

/**
 * Created by cuicb on 2017/4/18.
 */
public class SendSmsFactory implements Provider{
    @Override
    public Sender produce(){
        return new SmsSender();
    }
}
