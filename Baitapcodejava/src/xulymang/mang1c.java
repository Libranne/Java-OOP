package xulymang;

import java.util.Scanner;

public class mang1c {
	public static void main(String arg[]) 
	{
		int a[],s;
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print(" nhap so phan tu mang:");
		n=sc.nextInt();
		a= new int [n];
		for( i=0;i<n;i++)
		{ 
			System.out.print("a["+i+"]:");
			a[i]= sc.nextInt();
		}
		//in mang
		System.out.print("\n Mang da nhap:");
		for(i=0;i<n;i++)
			System.out.printf("%7d", a[i]);
		s=0;
		for(i=0;i<n;i++)
			s=s+a[i];
		System.out.print("\n tong mang:"+s);
	}

}
