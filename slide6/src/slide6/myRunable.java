/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide6;

/**
 *
 * @author chung
 */
public class myRunable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("r" + i);
            try {
                Thread.sleep(1000); // nghỉ 1s
            } catch (Exception e) {
                System.out.println("loi");
                break;
            }

        }
    }

}
