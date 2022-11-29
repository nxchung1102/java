/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b6_bt_oop_arrlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chung
 */
public class QuanLyNY {

    //biến toàn cục phải có _ ở đằng trước
    List<NguoiYeuCu> _lstNYC;
    Scanner _sc = new Scanner(System.in);
    NguoiYeuCu _nguoiyeucu;

    public QuanLyNY() {
        _lstNYC = new ArrayList<>();
        fakeData();
    }

    public void nhapDanhSachNYC() {
        //đối tượng
        System.out.println("nhap so luong NYC");
        int n = Integer.parseInt(_sc.nextLine());

        for (int i = 0; i < n; i++) {
            _nguoiyeucu = new NguoiYeuCu();
            // nhập thông tin cho đối tượng
            System.out.println("nhap ma NYC: ");
            String maNY = _sc.nextLine();
            _nguoiyeucu.setMaNY(maNY);

            System.out.println("nhap ho ten: ");
            String mame = _sc.nextLine();
            _nguoiyeucu.setMame(mame);

            System.out.println("nhap tuoi: ");
            String age = _sc.nextLine();
            _nguoiyeucu.setAge(age);

            System.out.println("nhap so do vong1: ");
            double vong1 = Double.parseDouble(_sc.nextLine());
            _nguoiyeucu.setVong1(vong1);

            System.out.println("nhap so do vong2: ");
            double vong2 = Double.parseDouble(_sc.nextLine());
            _nguoiyeucu.setVong2(vong2);

            System.out.println("nhap so do vong3: ");
            double vong3 = Double.parseDouble(_sc.nextLine());
            _nguoiyeucu.setVong3(vong3);

            // thêm vào danh sách
            _lstNYC.add(_nguoiyeucu);
        }
    }

    public void xuatDanhSachNYC() {
        for (NguoiYeuCu nguoiYeuCu : _lstNYC) {
            System.out.println(nguoiYeuCu.toString());
        }
    }

    public void timNYC() {
        System.out.println("nhap ma NYC can tim");
        String input = _sc.nextLine();
        int count = 0;
        for (int i = 0; i < _lstNYC.size(); i++) {

            if (_lstNYC.get(i).getMaNY().equals(input)) {
                System.out.println("thong tin NYC can tim la: ");
                System.out.println(_lstNYC.get(i).getMaNY());
                System.out.println(_lstNYC.get(i).toString());
                count++;
                break;
            }

        }
        if (count == 0) {
            System.out.println("khong tim thay NYC");
        }
    }

    public void xoaNYC() {
        System.out.println("nhap ma NYC can xoa");
        String input = _sc.nextLine();
        int count = 0;
        for (int i = 0; i < _lstNYC.size(); i++) {
            if (_lstNYC.get(i).getMaNY().equals(input)) {
                System.out.println("thong tin NYC can tim la: ");
                System.out.println(_lstNYC.get(i).getMaNY());
                System.out.println(_lstNYC.get(i).toString());
                //xóa
                _lstNYC.remove(i);
                count++;
                break;
            }

        }
        if (count == 0) {
            System.out.println("khong xoa duoc NYC");
        }
    }

    public void suaNYC() {
        System.out.println("nhap ma NYC can sua");
        String input = _sc.nextLine();
        for (int i = 0; i < _lstNYC.size(); i++) {

            if (_lstNYC.get(i).getMaNY().equals(input)) {
                System.out.println("-----thong tin can sua------");
                System.out.println("-----1. ho ten        ------");
                System.out.println("-----2. nam sinh      ------");
                System.out.println("-----3. so do vong1   ------");
                System.out.println("-----4. so do vong    ------");
                System.out.println("-----5. so do vong3   ------");
                System.out.println("nhap lua chon 1-5: ");
                int chon = Integer.parseInt(_sc.nextLine());
                switch (chon) {
                    case 1:
                        System.out.println("nhap ho ten moi");
                        String hoten = _sc.nextLine();
                        _lstNYC.get(i).setMame(hoten);
                        break;
                    case 2:
                        System.out.println("nhap tuoi moi");
                        String namSinh = _sc.nextLine();
                        _lstNYC.get(i).setAge(namSinh);
                        break;
                    case 3:
                        System.out.println("nhap vong1 moi");
                        double vong1 = Double.parseDouble(_sc.nextLine());
                        _lstNYC.get(i).setVong1(vong1);
                        break;
                    case 4:
                        System.out.println("nhap vong2 moi");
                        double vong2 = Double.parseDouble(_sc.nextLine());
                        _lstNYC.get(i).setVong2(vong2);
                        break;
                    case 5:
                        System.out.println("nhap vong3 moi");
                        double vong3 = Double.parseDouble(_sc.nextLine());
                        _lstNYC.get(i).setVong3(vong3);
                        break;
                    default:
                        System.out.println(" nhap lai cho dung");
                }
                return;
            }

        }

    }

    public void sapXepNYC() {
        Collections.sort(_lstNYC, new Comparator<NguoiYeuCu>() {
            @Override
            public int compare(NguoiYeuCu o1, NguoiYeuCu o2) {
               // return o1.getMame().compareTo(o2.getMame());
               return o1.getVong1()>o2.getVong1() ? 1:-1;
            }
        });
    }
    public void fakeData()
    {
    _lstNYC.add(new NguoiYeuCu("ny1", "chung", "20", 20, 20, 20));
    _lstNYC.add(new NguoiYeuCu("ny2", "lan", "25", 30, 80, 24));
    _lstNYC.add(new NguoiYeuCu("ny3", "thanh", "24", 60, 40, 21));
    _lstNYC.add(new NguoiYeuCu("ny4", "tùng", "16", 20, 70, 19));
    _lstNYC.add(new NguoiYeuCu("ny5", "linh", "19", 59, 25, 10));
    }
}
