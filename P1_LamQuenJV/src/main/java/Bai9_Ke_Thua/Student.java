/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9_Ke_Thua;

/**
 *
 * @author chung
 */
public class Student extends Person {

    private String mssv;
    private String mailFPT;

    public Student() {
    }

    public Student(String mssv, String mailFPT) {
        this.mssv = mssv;
        this.mailFPT = mailFPT;
    }

    public Student(String mssv, String mailFPT, String name, String CCCD, int age, String address) {
        super(name, CCCD, age, address);
        this.mssv = mssv;
        this.mailFPT = mailFPT;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getMailFPT() {
        return mailFPT;
    }

    public void setMailFPT(String mailFPT) {
        this.mailFPT = mailFPT;
    }

    @Override
    public void inFo() {

        super.inFo();
        System.out.print("mssv: " + mssv + "\n");
        System.out.print("mailFPT: " + mailFPT + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" + "mssv=" + mssv + ", mailFPT=" + mailFPT + '}';
    }

}
