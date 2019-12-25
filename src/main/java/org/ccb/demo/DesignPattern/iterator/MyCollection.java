package org.ccb.demo.DesignPattern.iterator;

/**
 * Created by cuicb on 2017/11/14.
 */
public class MyCollection implements Collection {

    public String string[];

    public MyCollection(String[] string) {
        this.string = string;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
