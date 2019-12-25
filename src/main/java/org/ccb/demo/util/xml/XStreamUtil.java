/*
package org.ccb.demo.util.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;

import java.io.*;

*/
/**
 * Created by cuicb on 2017/1/23.
 *//*

public class XStreamUtil<T> {
    private static XStream xStream;

    public void object2Xml(T Object, String path) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream(path);
        xStream.toXML(Object, fos);
    }

    public T xml2Object(T Object, String path) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        return (T) xStream.fromXML(fis);
    }

    public void object2XmlByStream(T object, String path) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(path);
            PrettyPrintWriter writer = new PrettyPrintWriter(pw);
            ObjectOutputStream out = xStream.createObjectOutputStream(writer);
            out.writeObject(object);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public T xml2ObjectByStream(String path) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
            BufferedReader reader = new BufferedReader(fileReader);
            ObjectInputStream in = xStream.createObjectInputStream(reader);
            return (T) in.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
*/
