package org.ccb.demo.DesignPattern.Factory.abstractFactory;

import org.ccb.demo.DesignPattern.Factory.common.Sender;

/**
 * Created by cuicb on 2017/4/18.
 */
public interface Provider {
    public Sender produce();
}
