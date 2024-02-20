package bai12;

import java.util.Scanner;

public class Hocsinh extends Nguoi {
	private String tenLop;
    public Hocsinh(){ super();}
    public void nhap()
    {
        super.nhap();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Lop: ");
        tenLop = sc.nextLine();
    }
    public void xuat()
    {
        super.xuat();
        System.out.printf(" %14s", tenLop);
    }
    public String getTenLop() {
        return tenLop;
    }

}
