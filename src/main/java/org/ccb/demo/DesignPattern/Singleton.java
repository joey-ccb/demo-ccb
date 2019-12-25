package org.ccb.demo.DesignPattern;

/**
 * Created by cuicb on 2017/11/9.
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}

class svs {
    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
