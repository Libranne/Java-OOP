package quanlyNhanVien;

import java.util.Scanner;

public class DSNV {
	// khai bao thuoc tinh
	int n;
	NhanVien ds[];
	// dinh nghia cac phuong thuc
	public void nhapDSNV() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so nhan vien:");
		n=sc.nextInt();
		ds= new NhanVien[n];
		
		for(int i=0;i<n;i++)
		{
			ds[i]= new NhanVien();
			ds[i].nhap();
			System.out.println("\n --------------");
		}
	}
	public void xuatDSNV()
	{
		System.out.println("\n DSNV:");
		for(int i=0;i<n;i++)
			ds[i].xuat();
		
	}
	public void tinhtongluong()
	{
		float s=0;
		for(int i=0;i<n;i++)
			s=s + ds[i].tinhluong();
		System.out.print("\n tong luong khong phu cap:"+ s);
	}
	public void tinhtongluongcoPC() {
		float s=0;
		for(int i=0;i<n;i++)
			s=s+ ds[i].tinhluong(1000000);
		System.out.print("\n tong luong co phu cap:"+ s);
	}
	  NhanVien tg = new NhanVien();
	public void sapxepluongchuaphucap()
	{
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				if( ds[i].tinhluong() > ds[j].tinhluong())
				{
					tg = ds[i];
					ds[i] =ds[j];
					ds[j]= tg;
				}
		xuatDSNV();
	}

}
