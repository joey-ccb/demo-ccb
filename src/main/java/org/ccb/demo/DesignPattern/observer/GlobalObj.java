package org.ccb.demo.DesignPattern.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by cuicb on 2017/12/20.
 */
public class GlobalObj {

    /**
     * The Queue.
     */
    public static BlockingQueue threadQueue = new ArrayBlockingQueue(50);
    /**
     * 正在解析城市
     */
    public static List<Integer> runCity = new LinkedList<>();

    /**
     * The constant waitCity.
     */
    public static List<Integer> waitCity = new LinkedList<>();
}
