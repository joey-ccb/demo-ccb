package org.ccb.demo.DesignPattern.Factory.abstractFactory.demo;

/**
 * Created by cuicb on 2019/12/20.
 */
public class HaierTelevisionFactory implements ProductFactory {
    @Override
    public Product produce() {
        return new HaierTelevision().TelevisionInfo();
    }
}
