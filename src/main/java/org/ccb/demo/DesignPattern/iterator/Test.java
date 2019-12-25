package org.ccb.demo.DesignPattern.iterator;

/**
 * Created by cuicb on 2017/11/14.
 */
public class Test {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E"};
        Collection collection = new MyCollection(arr);
        Iterator it = collection.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


}
