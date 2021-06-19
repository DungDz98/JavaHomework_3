package com.codegym;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Quan Ly Can Bo");
        System.out.println("1. Them can bo");
        System.out.println("2. Tim kiem can bo theo ten");
        System.out.println("3. Xoa nhan vien");
        System.out.println("4. Sua can bo");
        System.out.println("5. Hien thi can bo");
        System.out.println("6. Sap xep can bo");
        System.out.println("7. Tim can bo theo nganh");
        System.out.println("8. Thoat");
        System.out.println("Chon di ban: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                QuanLyCanBo.themCanBo();
                break;
            case 2:
                QuanLyCanBo.timCanBo();
                break;
            case 3:
                QuanLyCanBo.xoaNhanVien();
                break;
            case 4:
                QuanLyCanBo.suaCanBo();
                break;
            case 5:
                QuanLyCanBo.hienThiCanBo();
                break;
            case 6:
                QuanLyCanBo.sapXepCanBo();
                break;
            case 7:
                QuanLyCanBo.timKiemNganh();
                break;
            case 8:
                System.exit(0);
        }
    }
}
