/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b6_bt_oop_arrlist;

import java.util.*;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Qlbcl {

    Scanner _sc = new Scanner(System.in);
    List<Bingchilling> _lstBingCL;
    Bingchilling _BingCL;
    String _input;

    public Qlbcl() {
        _lstBingCL = new ArrayList<>();
    }

    public void inputList() {
//            System.out.println("nhap so luong bcl");
//            int n = Integer.parseInt(_sc.nextLine());
//            for (int i = 0; i < n; i++) 
        String Y_N;
        do {
            _BingCL = new Bingchilling();
            System.out.println("nhap id= ");
            _BingCL.setId(Integer.parseInt(_sc.nextLine()));
            System.out.println("nhap gia= ");
            _BingCL.setPrice(Double.parseDouble(_sc.nextLine()));
            System.out.println("nhap noi sx= ");
            _BingCL.setAddress(_sc.nextLine());
            System.out.println("nhap vi= ");
            _BingCL.setTaste(_sc.nextLine());
            _lstBingCL.add(_BingCL);
            System.out.println("có muốn tiếp tục không(Y/N)");
            Y_N = _sc.nextLine();
            if (Y_N.equalsIgnoreCase("N")) {
                break;
            }
        } while (Y_N.equalsIgnoreCase("Y"));

    }

    public void output() {
        for (Bingchilling bingchilling : _lstBingCL) {
            System.out.println(bingchilling.toString());
        }
    }

    public void search() {
        System.out.println("nhap id can tim");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstBingCL.size(); i++) {
            if (_lstBingCL.get(i).getId() == Integer.parseInt(_input)) {
                System.out.println(_lstBingCL.get(i).getId());
                return;
            }
        }
        System.out.println("khong tim duoc");
        //cách 2
//            for (Bingchilling bingchilling : _lstBingCL) {
//                if(bingchilling.getId()== Integer.parseInt(_input))
//                {
//                    System.out.println(bingchilling.toString());
//                }
//            }
    }

    public void del() {
        System.out.println("nhap id can xoa");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstBingCL.size(); i++) {
            if (_lstBingCL.get(i).getId() == Integer.parseInt(_input)) {
                System.out.println(_lstBingCL.get(i).getId());
                _lstBingCL.remove(i);
                System.out.println("xoa thanh cong");
                return;
            }
        }
        System.out.println("khong xoa duoc");
    }

    public void fix() {
        System.out.println("nhap id can sua");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstBingCL.size(); i++) {
            if (_lstBingCL.get(i).getId() == Integer.parseInt(_input)) {
                System.out.println("---1 gia, 2 noi sx, 3 vi");
                System.out.println("chon 1-3");
                int choice = Integer.parseInt(_sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("nhap gia= ");
                        double gia = Double.parseDouble(_sc.nextLine());
                        _lstBingCL.get(i).setPrice(gia);

                        break;
                    case 2:
                        System.out.println("nhap noi sx= ");
                        String noiSX = _sc.nextLine();
                        _BingCL.setAddress(_sc.nextLine());
                        break;
                    case 3:
                        System.out.println("nhap vi= ");
                        String vi = _sc.nextLine();
                        _BingCL.setTaste(_sc.nextLine());
                        break;
                        
                }
                System.out.println("sua thanh cong");
                return;
            }
        }
        System.out.println("khong sua duoc");
    }
    public void arrange(){
        System.out.println("sap xep theo gia");
    Collections.sort(_lstBingCL,(a,b)->(int)(a.getPrice()-b.getPrice()) );
    }
}
