package org.ccb.demo.DesignPattern.Factory.abstractFactory.demo;

/**
 * Created by cuicb on 2019/12/20.
 */
public class HaierAirConditionerFactory implements ProductFactory {
    @Override
    public Product produce() {
        return new HaierAirConditioner().AirConditionerInfo();
    }
}
