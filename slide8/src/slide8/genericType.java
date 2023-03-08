/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8;

/**
 *
 * @author chung
 */
public class genericType<T> {
    private T t;

    public genericType() {
    }

    public genericType(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "genericType{" + "t=" + t + '}';
    }
    
}
