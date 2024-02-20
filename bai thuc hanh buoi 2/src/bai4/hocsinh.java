package bai4;

import java.util.Scanner;

public class hocsinh {
	private String mahs,hoten,lop;
	int sobuoian;
	private int tongtienan;
	
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" nhap ma hoc sinh:");
		mahs= sc.nextLine();
		System.out.println(" nhap ho ten:");
		hoten=sc.nextLine();
		System.out.println("nhap lop:");
		lop=sc.nextLine();
		System.out.println(" nhap so buoi an:");
		sobuoian=sc.nextInt();
	}
	public void xuat()
	{
		System.out.printf("\n %7s",mahs);
		System.out.printf(" %15s",hoten);
		System.out.printf(" %10s",lop);
		System.out.printf(" %10d",sobuoian);
	}
	public int tongtienan()
	{
		return sobuoian*30000;
	}


}
