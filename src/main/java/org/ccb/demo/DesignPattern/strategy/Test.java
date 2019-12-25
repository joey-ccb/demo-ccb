package org.ccb.demo.DesignPattern.strategy;

/**
 * Created by cuicb on 2018/2/9.
 */
public class Test {
    public static void useStrategy() {
        // 具体使用策略
        Fruit apple = new Apple();
        // 将策略放入环境中并执行策略
        new FruitPrice(apple).printFruitPrice();
    }

    public static void main(String[] args) {
        System.out.println(true ^ true);
        System.out.println(false ^ false);

    }
}
