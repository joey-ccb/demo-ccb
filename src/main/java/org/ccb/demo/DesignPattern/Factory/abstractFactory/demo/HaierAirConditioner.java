package org.ccb.demo.DesignPattern.Factory.abstractFactory.demo;

/**
 * Created by cuicb on 2019/12/20.
 */
public class HaierAirConditioner implements AirConditioner{
    @Override
    public Product AirConditionerInfo() {
        return new Product("haier", "haierAirConditioner");
    }
}
