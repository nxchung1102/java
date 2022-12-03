/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9_Ke_Thua;

/**
 *
 * @author chung
 */
public class Main {
    public static void main(String[] args) {
        Student sv1 = new Student("PH1", "ph10@fpt", "chung", "123456", 20, "HN");
        //k tham số
        Student sv2 = new Student();
        sv2.setMssv("PH2");
        sv2.setMailFPT("ph12@fpt");
        sv2.setName("toi");
        sv2.setCCCD("123457");
        sv2.setAge(20);
        sv2.setAddress("HN");
        sv1.inFo();
        sv2.inFo();
    }
}
