package com.codegym;

public class CongNhan extends CanBo {
    private String Bac;
    private String Nganh;

    public CongNhan() {
    }

    public CongNhan(String bac, String nganh) {
        Bac = bac;
        Nganh = nganh;
    }

    public CongNhan(String hoTen, String namSinh, String gioiTinh, String diaChi, String bac, String nganh) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        Bac = bac;
        Nganh = nganh;
    }

    public String getBac() {
        return Bac;
    }

    public void setBac(String bac) {
        Bac = bac;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    @Override
    public void hienThi() {
        System.out.println("CongNhan{" +
                "Bac='" + Bac + '\'' +
                ", Nganh='" + Nganh + '\'' +
                '}');
    }

}
