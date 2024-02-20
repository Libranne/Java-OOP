package bai15;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private int namsinh;
    private String gioiTinh;
   public Nguoi(String hoTen,int namsinh, String gioiTinh) {
        this.hoTen = hoTen;
        this.namsinh= namsinh;
        this.gioiTinh = gioiTinh;
    }

    public Nguoi() {
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ho Ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap Nam Sinh : ");
        namsinh= sc.nextInt();
        System.out.print("Nhap Gioi Tinh: ");
        gioiTinh= sc.nextLine();
    }
    public void xuat()
    {
        System.out.printf("\n %16s", hoTen);
        System.out.printf("\n %16s", namsinh);
          System.out.printf(" %10s", gioiTinh);
    }
    public String getTenLop() {
        String tenLop="";
        return tenLop;
    }

}
