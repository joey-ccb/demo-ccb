package org.ccb.demo.dynamicProxy;

/**
 * Created by cuicb on 2019/11/21.
 */
public class WzCaramel extends XuJi implements Sugar {
    @Override
    public String taste(String taste) {
        String wzCaramel = "旺仔牛奶糖";
        System.out.print(wzCaramel);
        return " 味道是" + taste;
    }
}
