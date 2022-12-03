/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThiThu1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.*;

/**
 *
 * @author chung
 */
public class QLVC {

    Scanner _sc = new Scanner(System.in);
    List<Vaccine> _lstVC = new ArrayList<>();
    Vaccine _vc = new Vaccine();
    String getInputValue(String str){
        System.out.print(str);
        return _sc.nextLine();
    }

    public void input() {
        String Y_N;
        try {
                    do {

            
            String maVC = getInputValue("nhap ma vc: ");

            
            String tenVC = getInputValue("nhap ten vc: ");

            
            float tgian = Float.parseFloat(getInputValue("nhap thoi gian tac dung vaccine (ngay): "));

            System.out.print("nhap ngay het han vaccine: ");
            String date = _sc.nextLine();

            _lstVC.add(new Vaccine(maVC, tenVC, tgian, date));
            System.out.println("ban co muon tiep tuc Y_N ?");
            Y_N = _sc.nextLine();
            if (Y_N.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);
        } catch (Exception e) {
            System.out.println(" nhap sai kieu du lieu nhap lai");
            input();
        }
    }

    public void output() {
        for (Vaccine vaccine : _lstVC) {
            vaccine.inThongTin();
        }
    }

    public void TGTD() {
        for (Vaccine vaccine : _lstVC) {
            if (vaccine.getThoiGianTacDung() >= 180) {
                vaccine.inThongTin();
            }
        }
    }

    public void sapXep() {
        Collections.sort(_lstVC, new Comparator<Vaccine>() {
            @Override
            public int compare(Vaccine o1, Vaccine o2) {
                return -o1.getThoiGianTacDung() > o2.getThoiGianTacDung() ? 1 : -1;
            }
        });
    }

    public void add() {
        VaccineVN vcvn = new VaccineVN();
        System.out.print("nhap ma vaccine: ");
        vcvn.setMaVC(_sc.nextLine());
        System.out.print("nhap ten vaccine: ");
        vcvn.setTenVC(_sc.nextLine());
        System.out.print("nhap thoi gian tac dung vaccine (ngay): ");
        vcvn.setThoiGianTacDung(Float.parseFloat(_sc.nextLine()));
        System.out.print("nhap ngay het han vaccine: ");
        vcvn.setNgayHetHan(_sc.nextLine());
        System.out.print("nhap quoc gia: ");
        vcvn.setQuocGia(_sc.nextLine());
        vcvn.inThongTin();
    }

    public void menu() {
        do {
            System.out.println("--------------------------chuc nang-----------------------");
            System.out.println("1.nhap danh sach doi tuong.");
            System.out.println("2.xuat danh sach doi tuong.");
            System.out.println("3.xuat danh sach cac vaccine tac dung > 6 thang.");
            System.out.println("4.sap xep giam dan theo thoi gian tac dung.");
            System.out.println("5.ke thua.");
            System.out.println("0.thoat.");
            System.out.print("nhap lua chon cua ban: ");
            int choice = Integer.parseInt(_sc.nextLine());
            switch (choice) {
                case 1:
                    input();
                    break;
                case 2:
                    output();
                    break;
                case 3:
                    TGTD();
                    break;
                case 4:
                    sapXep();
                    output();
                    break;
                case 5:
                    add();
                    break;
                case 0:
                   System.exit(0);
            }
        } while (true);
    }
}
