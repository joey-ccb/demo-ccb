package org.ccb.demo.DesignPattern.strategy;

/**
 * Created by cuicb on 2018/2/9.
 */
public class FruitPrice {

    /**
     * 策略对象
     */
    private Fruit fruit;

    /**
     * @param fruit 策略对象
     */
    public FruitPrice(Fruit fruit) {
        this.fruit = fruit;
    }

    /**
     * @description 输出水果价格
     * @date 2018年1月14日 下午3:12:26
     */
    public void printFruitPrice() {
        fruit.price();
    }
}