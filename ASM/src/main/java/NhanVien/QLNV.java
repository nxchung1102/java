/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.util.*;

/**
 *
 * @author chung
 */
public class QLNV {

    Scanner _sc = new Scanner(System.in);
    List<NhanVien> _lstNV = new ArrayList<>();
    NhanVien _nv;
    Check _c = new Check();

    public String getInputValue(String str) {
        System.out.print(str);
        return _sc.nextLine();
    }

    public void input() {
        String Y_N;
        do {
            String maNV = _c.checkMaNV();
            if (maNV == null || maNV.trim().equalsIgnoreCase("")) {
                break;
            }
            String hoten = _c.checkHoTen();
            if (hoten == null || hoten.trim().equalsIgnoreCase("")) {
                break;
            }
            double luong = _c.checkLuong();
            String loaiNV = getInputValue("chon loai nhan vien (hc ||tt || tp): ");
            if (loaiNV.trim().equalsIgnoreCase("hc")) {
                _lstNV.add(new NhanVien(maNV, hoten, luong));
            } else if (loaiNV.trim().equalsIgnoreCase("tt")) {
                double doanhSo = _c.checkDoanhso();
                double hoaHong = _c.checkHoaHong();
                _lstNV.add(new TiepThi(doanhSo, hoaHong, maNV, hoten, luong));
            } else if (loaiNV.trim().equalsIgnoreCase("tp")) {
                double trachNhiem = _c.checkTrachNhiem();

                _lstNV.add(new TruongPhong(trachNhiem, maNV, hoten, luong));
            }
            Y_N = getInputValue("ban co muon tiep tuc nhap them nhan vien Y_N: ");
        } while (Y_N.equalsIgnoreCase("y"));
    }

    public void output() {
        for (NhanVien nv : _lstNV) {
            nv.inThongTin();
            System.out.println("------------------------------");
        }
    }

    public void find() {
        boolean check = false;
        String search = getInputValue("nhap ma nhan vien can tim: ");
        for (int i = 0; i < _lstNV.size(); i++) {
            if (_lstNV.get(i).getMaNV().equalsIgnoreCase(search)) {
                check = true;
                _lstNV.get(i).inThongTin();
                break;
            }
        }
        if (check == false) {
            System.out.println("khong tim duoc");
        }
    }

    public void remove() {
        boolean check = false;
        String del = getInputValue("nhap ma nhan vien nguoi can xoa: ");
        for (int i = 0; i < _lstNV.size(); i++) {
            if (_lstNV.get(i).getMaNV().equalsIgnoreCase(del)) {
                check = true;
                _lstNV.remove(i);
                output();
                break;
            }
        }
        if (check == false) {
            System.out.println("khong tim duoc");
        }
    }

    public void update() {
        boolean check = false;
        String fix = getInputValue("nhap ma nhan vien can sua: ");
        for (int i = 0; i < _lstNV.size(); i++) {
            NhanVien nv = _lstNV.get(i);
            if (nv.getClass().getName().equalsIgnoreCase("NhanVien.NhanVien")) {
                if (_lstNV.get(i).getMaNV().equalsIgnoreCase(fix)) {
                    check = true;
                    System.out.println("---SUA THON TIN---");
                    System.out.println("1. ho ten");
                    System.out.println("2. luong");
                    int choice = Integer.parseInt(getInputValue("nhap lua chon cua ban: "));
                    switch (choice) {
                        case 1:
                            String name = getInputValue("nhap ho ten: ");
                            _lstNV.get(i).setHoTen(name);

                            break;
                        case 2:
                            double luong = Double.parseDouble(getInputValue("nhap luong: "));
                            _lstNV.get(i).setLuong(luong);
                            break;
                        default:
                            System.out.println("khong co");
                    }
                    System.out.println("sua thanh cong");
                    output();
                    break;
                }
            } else if (nv.getClass().getName().equalsIgnoreCase("NhanVien.TiepThi")) {
                if (_lstNV.get(i).getMaNV().equalsIgnoreCase(fix)) {
                    TiepThi tt = (TiepThi) nv;

                    check = true;
                    System.out.println("---SUA THON TIN---");
                    System.out.println("1. ho ten");
                    System.out.println("2. luong");
                    System.out.println("3. doanh so");
                    System.out.println("4. hoa hong");
                    int choice = Integer.parseInt(getInputValue("nhap lua chon cua ban: "));
                    switch (choice) {
                        case 1:
                            String name = getInputValue("nhap ho ten: ");
                            _lstNV.get(i).setHoTen(name);

                            break;
                        case 2:
                            double luong = Double.parseDouble(getInputValue("nhap luong: "));
                            _lstNV.get(i).setLuong(luong);
                            break;
                        case 3:
                            double doanhSo = Double.parseDouble(getInputValue("nhap doanh so: "));
                            tt.setDoanhSo(doanhSo);
                            break;
                        case 4:
                            double hoaHong = Double.parseDouble(getInputValue("nhap % hoa hong: "));
                            tt.setHoaHong(hoaHong);
                            break;
                        default:
                            System.out.println("khong co");
                    }
                    System.out.println("sua thanh cong");
                    output();
                    break;
                }
            } else if (nv.getClass().getName().equalsIgnoreCase("NhanVien.TruongPhong")) {
                if (_lstNV.get(i).getMaNV().equalsIgnoreCase(fix)) {
                    TruongPhong tp = (TruongPhong) nv;

                    check = true;
                    System.out.println("---SUA THON TIN---");
                    System.out.println("1. ho ten");
                    System.out.println("2. luong");
                    System.out.println("3. trach nhiem");
                    int choice = Integer.parseInt(getInputValue("nhap lua chon cua ban: "));
                    switch (choice) {
                        case 1:

                            String name = getInputValue("nhap ho ten: ");
                            _lstNV.get(i).setHoTen(name);

                            break;
                        case 2:
                            double luong = Double.parseDouble(getInputValue("nhap luong: "));
                            _lstNV.get(i).setLuong(luong);
                            break;
                        case 3:
                            double trachNhiem = Double.parseDouble(getInputValue("nhap tien trach nhiem: "));
                            tp.setTrachNhiem(trachNhiem);
                            break;
                        default:
                            System.out.println("khong co");
                    }
                    System.out.println("sua thanh cong");
                    output();
                    break;
                }
            }

        }
        if (check == false) {
            System.out.println("khong tim duoc");
        }

    }

    public void salaryRange() {
        boolean check = false;
        double min = Double.parseDouble(getInputValue("nhap khoang luong toi thieu: "));
        double max = Double.parseDouble(getInputValue("nhap khoang luong toi da: "));
        for (int i = 0; i < _lstNV.size(); i++) {
            if (_lstNV.get(i).getLuong() >= min && _lstNV.get(i).getLuong() <= max) {
                check = true;
                _lstNV.get(i).inThongTin();
            }
        }
        if (check == false) {
            System.out.println("khong tim duoc");
        }
    }

    public void sortByName() {
        Collections.sort(_lstNV, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        output();
    }

    public void sortByIncome() {
        Collections.sort(_lstNV, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getThuNhap() > o2.getThuNhap() ? 1 : -1;
            }
        });
        output();
    }

    public void sortByIncomeTax() {
        Collections.sort(_lstNV, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return -o1.getThueTN() > o2.getThueTN() ? 1 : -1;
            }
        });
    }

    public void top5() {
        sortByIncomeTax();
        int n = Integer.parseInt(getInputValue("nhap so nguoi: "));
        for (int i = 0; i < n; i++) {
            _lstNV.get(i).inThongTin();
        }
    }

    public void menu() {
        int choice;
        do {
            System.out.println("---------------select function-----------------");
            System.out.println("-----1. nhap thong thong tin-------------------");
            System.out.println("-----2. xuat danh sach-------------------------");
            System.out.println("-----3. tim kiem theo ma nhan vien-------------");
            System.out.println("-----4. xoa nhan vien--------------------------");
            System.out.println("-----5. cap nhat thong tin nhan vien-----------");
            System.out.println("-----6. tim nhan vien theo khoang luong--------");
            System.out.println("-----7. sap xep theo ho ten--------------------");
            System.out.println("-----8. sap xep theo thu nhap------------------");
            System.out.println("-----9. top 5 nguoi dung dau-------------------");
            System.out.println("-----0. thoat----------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.print("nhap lua chon cua cau <3: ");
            choice = Integer.parseInt(_sc.nextLine());

            switch (choice) {
                case 1:
                    input();
                    break;
                case 2:
                    output();
                    break;
                case 3:
                    find();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    update();
                    break;
                case 6:
                    salaryRange();
                    break;
                case 7:
                    sortByName();
                    break;
                case 8:
                    sortByIncome();
                    break;
                case 9:
                    top5();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("nhap lai");
            }

        } while (true);

    }

}
