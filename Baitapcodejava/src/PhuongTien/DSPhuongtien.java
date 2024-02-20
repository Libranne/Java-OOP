package PhuongTien;

import java.util.Scanner;

public class DSPhuongtien {
	//khai bao thuoc tinh
	int n;
	phuongtien ds[];
	// dinh nghia cac phuong thuc
	void nhapds()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("\n nhap so luong phuong tien:");
		n=sc.nextInt();
		ds= new phuongtien[n];
		for(int i=0;i<n;i++)
		{
			ds[i] = new phuongtien();
			ds[i].nhap();
		}
	}
	void xuatds()
	{
		System.out.println("\n------------------------");
		System.out.println("\n DS phuong tien da nhap \n");
		for(int i=0;i<n;i++)
			ds[i].hien();
	}
	void tinhtongtienthue()
	{
		float s=0;
		for(int i=0;i<n;i++)
			s=s+ ds[i].tinhthue();
		System.out.println("\n tong tien thue:"+s);
	}

}
