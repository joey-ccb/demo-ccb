package org.ccb.demo.test.sample;

/**
 * Created by cuicb on 2019/12/3.
 */
public class ThroughGateHandler {
    private Passenger passenger;

    ThroughGateHandler(Passenger passenger) {
        this.passenger = passenger;
    }

    public void throughGateLockHandle(State state) {
        GateLockState gateLockState = (GateLockState) state;
        String behavior = passenger.getBehavior();
        if ("coin".equals(behavior)) {
            new CoinBehavior().coin(gateLockState);
        } else if ("pass".equals(behavior)) {
            new PassBehavior().pass(gateLockState);
        }
    }


    public static void main(String[] args) {
        Passenger passenger = new Passenger();
//        passenger.setBehavior("coin");
        passenger.setBehavior("pass");
        ThroughGateHandler handler = new ThroughGateHandler(passenger);
        GateLockState gateLockState = new GateLockState(false);
        handler.throughGateLockHandle(gateLockState);
    }
}
