/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dethithu3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author chung
 */
public class QLC {

    List<Cây> _lstC = new ArrayList<>();
    Scanner _sc = new Scanner(System.in);
    Cây c = new Cây();

    public QLC() {
        _lstC =new ArrayList<>();
       Cây c1 = new Cây(0, "cay bong mat", "xanh");
       Cây c2 = new Cây(1, "cay lay thit", "do");
       Cây c3 = new Cây(2, "cay an qua", "tim");
       _lstC.add(c1);
       _lstC.add(c2);
       _lstC.add(c3);
       
    }

    
    public void nhapDS() {
        String Y_N;
        do {
            c = new Cây();
            c.nhap();
            _lstC.add(c);
            System.out.print("ban co muon tiep tuc: Y/N ");
            Y_N = _sc.nextLine();
        } while (Y_N.equalsIgnoreCase("Y"));
    }

    public void xuatDS() {
        for (Cây cây : _lstC) {
            cây.inThongTin();
        }
    }

    public void sapxep() {
        Collections.sort(_lstC, new Comparator<Cây>() {
            @Override
            public int compare(Cây o1, Cây o2) {
                return -o1.getID() > o2.getID() ? 1 : -1;
            }
        });
        xuatDS();
    }
    public void remove(){
        System.out.print("nhap id can xoa: ");
        int idRemove = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < _lstC.size(); i++) {
            if(_lstC.get(i).getID()==idRemove){
            _lstC.remove(i);
            }
        }
        xuatDS();
    }
    public void keThua(){
    CayAnQua caq = new CayAnQua();
    caq.nhap();
    caq.inThongTin();
    CayAnQua caq2 = new CayAnQua("tao", 10, 20, "cay an qua", "mau xanh");
    caq2.inThongTin();
    }
    public void menu(){
    do {
            System.out.println("----------------QUAN LY CAY AN QUA---------------");
            System.out.println("1. nhap danh sach cay");
            System.out.println("2. xuat danh sach cay");
            System.out.println("3. sap xep cay an qua");
            System.out.println("4. xoa cay theo id");
            System.out.println("5. ke thua");
            System.out.println("0. ket thuc");
            System.out.print("nhap lua chon: ");
            int choice = Integer.parseInt(_sc.nextLine());
            switch (choice) {
                case 1:
                    nhapDS();
                    break;
                case 2:
                    xuatDS();
                    break;
                case 3:
                    sapxep();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    keThua();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
            
}
