package nhansuhsgiaovien;

import java.util.Scanner;

public class giaovien extends NhanSu{
	private float luongthang;
	public void nhap()
	{
		super.nhap();
		Scanner sc=new Scanner (System.in);
		System.out.println("nhap luong thang:");
		luongthang=sc.nextFloat();
	}
	public void xuat()
	{
		super.xuat();
		System.out.printf("%15.0f",luongthang);
	}
}
