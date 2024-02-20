package bai6;

import java.util.Scanner;




public class DSCN {
	int n,s;
	Congnhan ds[];
	// dinh nghia cac phuong thuc
	public void nhapDSCN() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so CN:");
		n=sc.nextInt();
		while(n<=0 || n>=20)
			System.out.println("nhap lai:");
		
		ds= new Congnhan[n];
		
		for(int i=0;i<n;i++)
		{
			ds[i]= new Congnhan();
			ds[i].nhap();
			System.out.println("\n --------------");
		}
	}
	public void xuatDSCN()
	{
		System.out.println("\n Danh sach CN:");
		for(int i=0;i<n;i++)
			ds[i].xuat();
		
	}
	public void sosanh()
	{
		System.out.println("\n nhap so thuc s:");
		Scanner sc = new Scanner(System.in);
		s=sc.nextInt();
		for(int i=0;i<n;i++)
		if(ds[i].tinhluong() >s) 
			xuatDSCN();
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
