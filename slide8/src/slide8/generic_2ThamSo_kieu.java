/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8;

/**
 *
 * @author chung
 */
public class generic_2ThamSo_kieu <T,S>{
    private T t;
    private S s;

    public generic_2ThamSo_kieu() {
    }

    public generic_2ThamSo_kieu(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "generic_2ThamSo_kieu{" + "t=" + t + ", s=" + s + '}';
    }
     
}
