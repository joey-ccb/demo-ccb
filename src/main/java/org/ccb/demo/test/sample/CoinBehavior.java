package org.ccb.demo.test.sample;

/**
 * Created by cuicb on 2019/12/3.
 */
public class CoinBehavior implements Event{

    public void coin(GateLockState gateLockState){
        if(gateLockState.isLock()){
            gateLockState.unLock();
            System.out.println("门解锁啦, 可以通过");
        }else { // 解锁状态时
            System.out.println("thankyou");
        }
    }
}
