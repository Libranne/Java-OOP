import java.io.Serializable;
import java.util.*;

import TienThuong.TienThuong;

public class SinhVien extends Person implements TienThuong ,Serializable{
    private String lop;
    private float diemTL;
    private float diemRL;
    private int soTC;
    static float tien1TC = 378000;
    
    public SinhVien(String lop,float diemTL,float diemRL,int soTC)
    {
        super();
        this.lop=lop;
        this.diemRL=diemRL;
        this.diemTL=diemTL;
        this.soTC=soTC;
    }
    public SinhVien(){super(); }

    public String getLop() {
        return lop;
    }

    public float getDiemTL() {
        return diemTL;
    }

    public float getDiemRL() {
        return diemRL;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setDiemTL(float diemTL) {
        this.diemTL = diemTL;
    }

    public void setDiemRL(float diemRL) {
        this.diemRL = diemRL;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return "SinhVien{"+super.toString() + ",lop=" + lop + 
                ",diemTL=" + diemTL + ",diemRL=" + diemRL + 
                ",soTC=" + soTC + ",Tien thuong="+tinhTienThuong()+'}';
    }
    public void nhap()
    {
        super.nhap();
        sc.nextLine();
        System.out.print("Nhap lop: ");
        lop=sc.nextLine();
        System.out.print("Nhap diem TL: ");
        diemTL=sc.nextFloat();
        System.out.print("Nhap diem RL: ");
        diemRL=sc.nextFloat();
        System.out.print("Nhap so TC: ");
        soTC=sc.nextInt();   
    }
    public float tinhTienThuong()
    {
        return this.soTC*tien1TC*0.5f;
    }}
