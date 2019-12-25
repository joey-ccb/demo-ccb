package org.ccb.demo.DesignPattern.Bridge;

/**
 * Created by cuicb on 2017/4/19.
 */
public abstract class Bridge implements Sourceable{
    private Sourceable source;

    public void setSource(Sourceable source) {
        this.source = source;
    }
    public Sourceable getSource() {
        return source;
    }

    public abstract void method();
}
