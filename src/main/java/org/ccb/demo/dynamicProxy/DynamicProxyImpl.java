package org.ccb.demo.dynamicProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by cuicb on 2019/11/21.
 */
public class DynamicProxyImpl implements InvocationHandler {

    private Object target;//需要代理的目标对象

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // doSomething
        Object result = method.invoke(target, args);

        return result;
    }

    public Object sugarProxy(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public static void main(String[] args) {
        DynamicProxyImpl dp = new DynamicProxyImpl();
        Sugar sugar = (Sugar) dp.sugarProxy(new WzCaramel());
        System.out.println(sugar.taste("奶香味"));
    }
}
