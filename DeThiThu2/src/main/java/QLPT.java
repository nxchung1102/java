
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author chung
 */
public class QLPT {

    List<PhuongTien> _lstPT = new ArrayList<>();
    Scanner _sc = new Scanner(System.in);
    PhuongTien _PT;

    public void nhapDS() {
        System.out.println("mhap loai phuong tien: mb || oto || xd ");
        String loaiPT = _sc.nextLine();
        String Y_N;
        do {
            do {
                if (loaiPT.equalsIgnoreCase("mb")) {
                    _PT = new MayBay();
                } else if (loaiPT.equalsIgnoreCase("oto")) {
                    _PT = new Oto();
                } else if (loaiPT.equalsIgnoreCase("xd")) {
                    _PT = new XeDap();
                }
                if (!loaiPT.equalsIgnoreCase("mb") && !loaiPT.equalsIgnoreCase("oto") && !loaiPT.equalsIgnoreCase("xd")) {
                    System.out.println("nhap lai");                   
                }
            } while (!loaiPT.equalsIgnoreCase("mb") && !loaiPT.equalsIgnoreCase("oto") && !loaiPT.equalsIgnoreCase("xd"));

            _PT.nhap();

            _lstPT.add(_PT);
            System.out.print("ban muon nhap tiep hay khong Y/N: ");
            Y_N = _sc.nextLine();
        } while (Y_N.equalsIgnoreCase("Y"));

    }

    public void xuatDS() {
        for (PhuongTien phuongTien : _lstPT) {
            phuongTien.inThongTin();
        }
    }

    public void xuatPhuongTienQGVN() {
        for (int i = 0; i < _lstPT.size(); i++) {
            if (_lstPT.get(i).getTenQuocGia().equalsIgnoreCase("Viet Nam")) {
                _lstPT.get(i).inThongTin();
            }
        }
    }

    public void sapXepTheoNamSX() {
        Collections.sort(_lstPT, new Comparator<PhuongTien>() {
            @Override
            public int compare(PhuongTien o1, PhuongTien o2) {
                return -o1.getNamSX() > o2.getNamSX() ? 1 : -1;
            }
        });
        xuatDS();
    }

    public void keThua() {
        MayBay mb = new MayBay();
        mb.nhap();
        mb.inThongTin();
    }

    public void menu() {
        do {
            System.out.println("----------------QUAN LY SINH VIEN---------------");
            System.out.println("1. nhap danh sach phuong tien");
            System.out.println("2. xuat danh sach phuong tien");
            System.out.println("3. xuat danh sach phuong tien co quoc gia vn");
            System.out.println("4. sap xep giam dan theo nam SX");
            System.out.println("5. ke thua");
            System.out.println("6. ket thuc");
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
                    xuatPhuongTienQGVN();
                    break;
                case 4:
                    sapXepTheoNamSX();
                    break;
                case 5:
                    keThua();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

}
