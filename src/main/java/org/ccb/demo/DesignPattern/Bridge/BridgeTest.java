package org.ccb.demo.DesignPattern.Bridge;

/**
 * Created by cuicb on 2017/4/19.
 */
public class BridgeTest {
    public static void main(String[] args) {

        Bridge bridge = null;

        /*调用第一个对象*/
        Sourceable source1 = new SourceSub1();
        bridge = new MyBridge();
        bridge.setSource(source1);
        bridge.method();

        /*调用第二个对象*/
        Sourceable source2 = new SourceSub2();
        bridge = new MyBridge();
        bridge.setSource(source2);
        bridge.method();
        System.out.println();
    }
}
