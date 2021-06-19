package com.codegym;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyCanBo {
    //Them CanBo = CongNhan/KySu/NhanVien
    //FindByName
    //DeleteNhanVienByName
    //EditNhanVienByName
    //DisplayDanhSachCanBo
    //SortNVByName
    //FindAllCanBoByName
    //Exit
    static Scanner sc = new Scanner(System.in);
    static ArrayList<CanBo> list = new ArrayList<>();

    public static void themCanBo() {
        while (true) {
            System.out.println("Ban muon them can bo nao?");
            System.out.println("1. Cong nhan");
            System.out.println("2. Ky su");
            System.out.println("3. Nhan Vien");
            System.out.println("4. Tro lai");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 4) {
                return;
            }
            switch (choice) {
                case 1:
                    themCongNhan();
                    break;
                case 2:
                    themKySu();
                    break;
                case 3:
                    themNhanVien();
                    break;
            }
        }
    }

    public static void themCongNhan() {
        System.out.println("Nhap Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap Nam sinh: ");
        String namSinh = sc.nextLine();
        System.out.println("Nhap Gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhap Dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhap Bac: ") ;
        String Bac = sc.nextLine();
        System.out.println("Nhap Nganh: ");
        String Nganh = sc.nextLine();
        list.add(new CongNhan(hoTen, namSinh, gioiTinh, diaChi, Bac, Nganh));
    }
    public static void themKySu() {
        System.out.println("Nhap Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap Nam sinh: ");
        String namSinh = sc.nextLine();
        System.out.println("Nhap Gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhap Dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhap Nganh: ");
        String Nganh = sc.nextLine();
        list.add(new KySu(hoTen, namSinh, gioiTinh, diaChi, Nganh));
    }
    public static void themNhanVien() {
        System.out.println("Nhap Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap Nam sinh: ");
        String namSinh = sc.nextLine();
        System.out.println("Nhap Gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhap Dia chi: ");
        String diaChi = sc.nextLine();
        list.add(new NhanVien(hoTen, namSinh, gioiTinh, diaChi));
    }

    public static void timCanBo() {
        System.out.println("Nhap ten: ");
        String hoTen = sc.nextLine();
        int index = list.indexOf(hoTen);
        if (index < 0) {
            System.out.println("Khong co ket qua!");
        } else {
            System.out.println(list.get(index));
        }
    }

    public static void xoaNhanVien() {
        System.out.println("Nhap ten: ");
        String hoTen = sc.nextLine();
        for (CanBo nhanVien: list) {
            if (nhanVien instanceof NhanVien && nhanVien.getHoTen().equals(hoTen)) {
                list.remove(nhanVien);
            }
        }
    }

    public static void suaCanBo() {
        System.out.println("Nhap ten: ");
        String hoTenOld = sc.nextLine();
        System.out.println("----Thong tin moi----");
        System.out.println("Nhap Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap Nam sinh: ");
        String namSinh = sc.nextLine();
        System.out.println("Nhap Gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhap Dia chi: ");
        String diaChi = sc.nextLine();
        NhanVien nhanVien = new NhanVien(hoTen, namSinh, gioiTinh, diaChi);
        int index = list.indexOf(hoTenOld);
        list.set(index, nhanVien);
    }

    public static void hienThiCanBo() {
        for (CanBo element: list) {
            element.hienThi();
        }
    }

    public static void sapXepCanBo() {
        list.sort(new Comparator<CanBo>() {
            @Override
            public int compare(CanBo o1, CanBo o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }

    public static void timKiemNganh() {
        System.out.println("Nhap nganh: ");
        String Nganh = sc.nextLine();
        for (CanBo element: list) {
            if (element instanceof CongNhan) {
                if (((CongNhan) element).getNganh().equals(Nganh)) {
                    element.hienThi();
                }
            } else if (element instanceof KySu) {
                if (((KySu) element).getNganh().equals(Nganh)) {
                    element.hienThi();
                }
            }
        }
    }


}
