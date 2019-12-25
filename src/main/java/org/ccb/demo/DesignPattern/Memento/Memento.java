package org.ccb.demo.DesignPattern.Memento;

/**
 * Created by cuicb on 2017/6/6.
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}