package bai15;

import java.util.Scanner;

public class Hocsinh extends Nguoi{
	private String tenLop;
	private String gioithieu;
    public Hocsinh(){ super();}
    public void nhap()
    {
        super.nhap();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Lop: ");
        tenLop = sc.nextLine();
        System.out.print("Gioi thieu: ");
        gioithieu = sc.nextLine();
    }
    public void xuat()
    {
        super.xuat();
        System.out.printf(" %14s", tenLop);
        System.out.printf(" %14s", gioithieu);
    }
    public String getTenLop() {
        return tenLop;
    }

}
