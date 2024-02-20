package quanlyNhanVien;

import java.util.Scanner;

public class NhanVien {
	// khai bao thuoc tinh
	private String maNV;
	private String tenNV;
	private int tuoi;
	private String gioitinh;
	private float hesl;
	static float luongcb;
	
	// dinh nghia phuong thuc
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print(" Nhap Ma NV:");
		maNV = sc.nextLine();
		System.out.println(" Nhap Ten NV:");
		tenNV= sc.nextLine();
		System.out.println("nhap gioi tinh:");
		gioitinh= sc.nextLine();
		System.out.println("nhap tuoi:");
		tuoi= sc.nextInt();
		System.out.println(" nhap He SL:");
		hesl= sc.nextFloat();
	}
	public void xuat() 
	{
		System.out.printf("\n %7s",maNV);
		System.out.printf(" %20s",tenNV);
		System.out.printf(" %5s",gioitinh);
		System.out.printf(" %5d",tuoi);
		System.out.printf(" %7.1f",hesl);
		System.out.printf(" %10.0f",luongcb);
		System.out.printf(" %15.0f",tinhluong());
		System.out.printf(" %15.0f",tinhluong(1000000));
	}
	public float tinhluong()
	{
		return hesl*luongcb;
	}
	public float tinhluong(float phucap )
	{
		return hesl*luongcb+ phucap;
	}
	public void setHSL(float hsl)
	{
		hesl=hsl;
	}
	static void setluongcb(float lcb)
	{
		luongcb=lcb;
	}

}
