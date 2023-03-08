/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide6;

/**
 *
 * @author chung
 */
public class myThread extends Thread {
//viết nhiệm vụ trong run

    @Override
    public void run() {
        // viết các số từ 1-10 sau mỗi số nghỉ 1s 
        for (int i = 1; i <= 10; i++) {
            System.out.println("t" + i);
            try {
                Thread.sleep(1000); // nghỉ 1s
            } catch (Exception e) {
                System.out.println("loi");
                break;
            }

        }
    }

}
