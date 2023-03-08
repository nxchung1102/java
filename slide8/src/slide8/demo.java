/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slide8;

/**
 *
 * @author chung
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //tạo đối tượng dùng non generic
       genericType g = new genericType();
       g.setT("hello");
        System.out.println(g.getT());
        g.setT(10);
        //-----------
        //generic có định kiểu chỉ dùng được với kiểu DL quy định và kiểu DL quy định phải dùng đối tượng(lớp bao wrapper)
        genericType<String> g2 = new genericType<>();
        g2.setT("hi");
        System.out.println(g2.getT());
    }
    
}
