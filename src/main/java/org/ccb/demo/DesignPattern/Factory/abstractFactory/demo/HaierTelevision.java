package org.ccb.demo.DesignPattern.Factory.abstractFactory.demo;

/**
 * Created by cuicb on 2019/12/20.
 */
public class HaierTelevision implements Television{
    @Override
    public Product TelevisionInfo() {
        return new Product("haier", "haierTelevision");
    }
}
