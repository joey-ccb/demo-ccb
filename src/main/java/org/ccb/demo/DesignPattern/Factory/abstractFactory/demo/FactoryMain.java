package org.ccb.demo.DesignPattern.Factory.abstractFactory.demo;

/**
 * Created by cuicb on 2019/12/20.
 */
public class FactoryMain {
    public static void main(String[] args) {
        ProductFactory productFactory = new HaierAirConditionerFactory();
        productFactory = new HaierTelevisionFactory();
        Product product = productFactory.produce();
        System.out.println(product.toString());
    }
}
