package org.ccb.demo.test.sample;

/**
 * Created by cuicb on 2019/12/3.
 */
public class GateLockState implements State {
    /**
     * 锁
     */
    private boolean lock = true;

    public GateLockState(boolean lock) {
        this.lock = lock;
    }

    public boolean isLock() {
        return lock;
    }

    /**
     * 锁定动作
     */
    public void locked() {
        this.lock = true;
    }

    /**
     * 解锁动作
     */
    public void unLock() {
        this.lock = false;
    }
}
