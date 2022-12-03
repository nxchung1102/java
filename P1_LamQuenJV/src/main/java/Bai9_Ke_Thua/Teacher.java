/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9_Ke_Thua;

/**
 *
 * @author chung
 */
public class Teacher extends Person {

    private String maGV;
    private String emailFE;

    public Teacher() {
    }
    

    public Teacher(String maGV, String emailFE) {
        this.maGV = maGV;
        this.emailFE = emailFE;
    }

    public Teacher(String maGV, String emailFE, String name, String CCCD, int age, String address) {
        super(name, CCCD, age, address);
        this.maGV = maGV;
        this.emailFE = emailFE;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getEmailFE() {
        return emailFE;
    }

    public void setEmailFE(String emailFE) {
        this.emailFE = emailFE;
    }

    @Override
    public String toString() {
        return super.toString()+"Teacher{" + "maGV=" + maGV + ", emailFE=" + emailFE + '}';
    }

}
