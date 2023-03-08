/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slide6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chung
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
        try {
            //tạo thread dùng myrunable
            t1.join(); // đợi t1 chạy hết mới đến r1
            //trong thread cả 2 t1 và r1 chạy gần như // 
            //khi dùng extend khi class chưa kế thừa với 1 lớp cha nào
            
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Thread r1 = new Thread(new myRunable());
        r1.start();
    }
    
}
