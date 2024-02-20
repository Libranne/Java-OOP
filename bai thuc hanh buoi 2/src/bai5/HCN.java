package bai5;

import java.util.Scanner;

public class HCN {
	// khai bao cac thuoc tinh
				private float cd,cr;
				// dinh nghia phuong thuc 
				public void nhap()
				{ Scanner sc=new Scanner(System.in);
				System.out.println(" nhap chieu dai:");
				cd=sc.nextFloat();
				System.out.println(" nhap chieu rong:");
				cr=sc.nextFloat();
				}
					public void xuat()
					{
						System.out.println("\n chieu dai:"+cd);
						System.out.println("\n chieu rong:"+cr);
						System.out.println("\n dien tich:"+dientich());
						System.out.println("\n chu vi:"+chuvi());
					}
					
					
					public float dientich() {
						return  cd*cr;
					}
					public float chuvi()
					{
						return (cd+cr)*2;
					}	
					public String toString()
					{
						return "\n("+cd+","+cr+","+dientich() +","+ chuvi()+ ")";
					}
					

}
