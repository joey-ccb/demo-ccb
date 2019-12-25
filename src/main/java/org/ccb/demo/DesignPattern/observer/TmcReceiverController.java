package org.ccb.demo.DesignPattern.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by cuicb on 2017/12/21.
 */
public class TmcReceiverController {

    private static final Logger log = LogManager.getLogger(TmcReceiverController.class);

    /**
     * Insert run city.
     *
     * @param city the city
     */
    public static void insertRunCity(int city) {
        GlobalObj.runCity.add(city);
    }

    /**
     * Remove run city.
     *
     * @param city the city
     */
    public static void removeRunCity(int city) {
        GlobalObj.runCity.remove(GlobalObj.runCity.indexOf(city));
    }

    /**
     * Insert wait city.
     *
     * @param city the city
     */
    public static void insertWaitCity(int city) {
        GlobalObj.waitCity.add(city);
    }

    /**
     * Remove wait city.
     *
     * @param city the city
     */
    public static void removeWaitCity(int city) {
        GlobalObj.waitCity.remove(GlobalObj.waitCity.indexOf(city));
    }

    /**
     * Has run city boolean.
     *
     * @param city the city
     * @return the boolean
     */
    public static boolean hasRunCity(int city) {
        return GlobalObj.runCity.contains(city);
    }

    /**
     *
     * @param city the city
     * @return the boolean
     */
    public static boolean hasWaitCity(int city) {
        return GlobalObj.waitCity.contains(city);
    }

    /**
     * Thread wait.
     */
    public static void threadWait() {
        try {
            GlobalObj.threadQueue.put(Thread.currentThread());
        } catch (InterruptedException e) {
            log.error(e);
        }
    }

    /**
     * Thread notify.
     */
    public static void threadNotify() {
        try {
            GlobalObj.threadQueue.take().notify();
        } catch (InterruptedException e) {
            log.error(e);
        }
    }
}
