package com.codegym;

public class KySu extends CanBo{
    private String Nganh;

    public KySu() {
    }

    public KySu(String nganh) {
        Nganh = nganh;
    }

    public KySu(String hoTen, String namSinh, String gioiTinh, String diaChi, String nganh) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        Nganh = nganh;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    @Override
    public void hienThi() {
        System.out.println("KySu{" +
                "Nganh='" + Nganh + '\'' +
                '}');
    }
}
