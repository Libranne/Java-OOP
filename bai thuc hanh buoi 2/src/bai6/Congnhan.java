package bai6;

import java.util.Scanner;

public class Congnhan {
	private String hoten;
	private float hesl;
	static float luongcb;
	// dinh nghia phuong thuc
		public void nhap()
		{
			Scanner sc= new Scanner(System.in);
			
			System.out.println(" Nhap Ten CN:");
			hoten= sc.nextLine();
			
			System.out.println(" nhap He SL:");
			hesl= sc.nextFloat();
		}
		public void xuat() 
		{
			
			System.out.printf(" %20s",hoten);
			
			System.out.printf(" %7.1f",hesl);
			System.out.printf(" %10.0f",luongcb);
			System.out.printf(" %15.0f",tinhluong());

		}
		public float tinhluong()
		{
			return hesl*luongcb;
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
