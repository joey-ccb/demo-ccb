package org.ccb.demo.DesignPattern.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by cuicb on 2017/12/20.
 */
public class CityObserver implements Observer {

    private static final Logger log = LogManager.getLogger(CityObserver.class);
    private int city;

    public CityObserver(int city) {
        this.city = city;
    }

    @Override
    public void update() {
        TmcReceiverController.removeRunCity(city);
        TmcReceiverController.removeWaitCity(city);
        TmcReceiverController.threadNotify();
        log.info("CityCode={},notifyAll", city);
    }
}
