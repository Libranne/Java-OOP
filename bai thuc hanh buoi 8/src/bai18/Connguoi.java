package bai18;

import java.util.Scanner;

public class Connguoi {
	protected String ten;
    protected int tuoi;
    protected String diaChi;
    protected int soNamCT;
    Scanner sc = new Scanner(System.in);

    public Connguoi(String ten, int tuoi, String diaChi, int soNamCT) {
        super();
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soNamCT = soNamCT;

    }

    public Connguoi() {
        super();
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getSoNamCT() {
        return soNamCT;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoNamCT(int soNamCT) {
        this.soNamCT = soNamCT;
    }

    @Override
    public String toString() {
        return "" + "ten=" + ten + ", tuoi=" + tuoi + ", diaChi=" + diaChi + ", soNamCT=" + soNamCT ;
    }

    public void nhap() {
        System.out.print("Nhap ho ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap so nam cong tac: ");
        soNamCT=sc.nextInt();

    }
    public float tinhluong()
    {
        return 0;
    }
    public float tienThuong()
    {
        return 0;
    }

}
