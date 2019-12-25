package org.ccb.demo.test.sample;

/**
 * Created by cuicb on 2019/12/3.
 */
public class PassBehavior implements Event {

    public void pass(GateLockState gateLockState) {
        if (gateLockState.isLock()) {
            System.out.println("alarm");
        } else { // 解锁状态时
            gateLockState.locked();
            System.out.println("我锁住了");
        }
    }
}
