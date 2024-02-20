package nhansuhsgiaovien;

import java.util.Scanner;

public class hocsinh  extends NhanSu{
	private float diemtb;
	
	public void nhap()
	{
		super.nhap();
		Scanner sc=new Scanner (System.in);
		System.out.println("nhap DTB:");
		diemtb=sc.nextFloat();
	}
	public void xuat()
	{
		super.xuat();
		System.out.printf("%7.1f",diemtb);
	}

}
