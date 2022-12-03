/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author chung
 */
public class QLSVPL {
    
    List<SinhVienPoly> lstSV = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    SinhVienPoly sv;
    
    String getInputValue(String text) {
        System.out.print(text);
        return sc.nextLine();
    }
    
    public void nhap() {
        String Y_N;
        do {
            
            String name = getInputValue("nhap ho ten: ");
            if (name == null || name.trim().equalsIgnoreCase("")) {
                break;
            }
            String job = getInputValue("nhap ten nganh (IT or Biz): ");
            if (job.equalsIgnoreCase("IT")) {
                
                double java = Double.parseDouble(getInputValue("nhap diem java: "));
                double html = Double.parseDouble(getInputValue("nhap diem html: "));
                double css = Double.parseDouble(getInputValue("nhap diem css: "));
                lstSV.add(new SinhVienIT(java, html, css, name, job));
                
            } else if (job.equalsIgnoreCase("Biz")) {
                
                double marketting = Double.parseDouble(getInputValue("nhap diem marketting : "));
                double sale = Double.parseDouble(getInputValue("nhap diem sale: "));
                lstSV.add(new SinhVienBiz(marketting, sale, name, job));
            }
            Y_N = getInputValue("ban co muon tiep tuc nhap them sinh vien Y_N: ");
        } while (Y_N.equalsIgnoreCase("y"));
    }
    
    public void xuat() {
        for (SinhVienPoly sinhVienPoly : lstSV) {
            sinhVienPoly.xuat();
        }
    }
    
    public void hocLuc() {
        for (SinhVienPoly sv : lstSV) {
            if (sv.getHocLuc().equalsIgnoreCase("hoc luc gioi")) {
                System.out.printf("|%-20s | %-10s | %-10.2f | %-10s |",sv.getName(),sv.getJob(),sv.getDiem(),sv.getHocLuc());
            }
        }
    }
    
    public void xapSep() {
        Collections.sort(lstSV, new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                return -o1.getDiem() > o2.getDiem() ? 1 : -1;
            }
        });
    }
    
    public void menu() {
        do {
            System.out.println("----------------QUAN LY SINH VIEN---------------");
            System.out.println("1. nhap danh sach sinh vien");
            System.out.println("2. xuat thong tin danh sach sinh vien");
            System.out.println("3. xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. sap xep danh sach sinh vien theo diem");
            System.out.println("5. ket thuc");
            int choice = Integer.parseInt(getInputValue("nhap lua chon cua ca^u <3: "));
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    hocLuc();
                    break;
                case 4:
                    xapSep();
                    xuat();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
    
}
