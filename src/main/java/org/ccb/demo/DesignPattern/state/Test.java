package org.ccb.demo.DesignPattern.state;

/**
 * Created by cuicb on 2018/2/9.
 */
public class Test {
    /**
     * @description 使用状态模式：状态模式，又称状态对象模式（Pattern of Objects for
     *              States），状态模式是对象的行为模式。状态模式允许一个对象在其内部状态改变的时候改变其行为。这个对象看上去就像是改变了它的类一样
     * @date 2018年1月14日 下午4:04:16
     */
    public static void useState() {
        // 具体使用状态
        Orange cyanOrange = new CyanOrange();
        // 创建环境
        OrangeStateManage orangeStateManage = new OrangeStateManage();
        // 设置状态并执行
        orangeStateManage.setState(cyanOrange);
        orangeStateManage.print();
    }
}
