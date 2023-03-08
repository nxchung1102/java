/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.java_lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author chung
 */
public class XFile {

    public static byte[] read(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            int n = fis.available();
            byte[] data = new byte[n];
            fis.read(data);
            fis.close();
            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void write(String path, byte[] data) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Object readObj(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object obj = ois.readObject();
            ois.close();
            return obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void wriObj(String path, Object obj) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(obj);
            oos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
