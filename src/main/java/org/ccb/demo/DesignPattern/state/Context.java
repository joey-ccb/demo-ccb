package org.ccb.demo.DesignPattern.state;

/**
 * Created by cuicb on 2018/2/9.
 */
public class Context {

    /**
     * 状态对象
     */
    private State state;

    /**
     * @description 设置状态
     * @date 2018年1月14日 下午9:13:20
     * @param state 具体状态
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * @description 执行策略方法
     * @date 2018年1月14日 下午8:43:31
     */
    public void request() {
        state.handle();
    }
}
