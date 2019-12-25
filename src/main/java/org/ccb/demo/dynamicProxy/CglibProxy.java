package org.ccb.demo.dynamicProxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

public class CglibProxy implements MethodInterceptor {

    private Object target;

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object invoke = method.invoke(target, args);//方法执行，参数：target 目标对象 arr参数数组
        return invoke;
    }

    //定义获取代理对象方法
    public Object sugarProxy(Object objectTarget) {
        //为目标对象target赋值
        this.target = objectTarget;
        Enhancer enhancer = new Enhancer();
        //设置父类,因为Cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(objectTarget.getClass());
        enhancer.setCallback(this);// 设置回调
        Object result = enhancer.create();//创建并返回代理对象
        return result;
    }


    public static void main(String[] args) {
//        CglibProxy cglib = new CglibProxy();
//        XuJi xj = (XuJi) cglib.sugarProxy(new WzCaramel());
//        xj.getType();
//        Sugar sugar = (Sugar) cglib.sugarProxy(new WzCaramel());
//        sugar.taste("真香");

        HashSet set = new HashSet<>();
        new HashMap<>();
        new ConcurrentHashMap<>();

    }
}
