package xulymang;

import java.util.Random;
import java.util.Scanner;

public class mang2c {
	public static void main(String arg[]) {
		int a[][];
		int h,c;
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print(" nhap so hang:");
		h=sc.nextInt();
		System.out.print(" nhap so cot:");
		c=sc.nextInt();
		a= new int [h][c];
		Random rd= new Random();
		for(i=0;i<h;i++)
			for(j=0;j<c;j++)
				a[i][j]=rd.nextInt(100);
		// in mang 2 chieu
		System.out.print("\n mang 2 chieu ngau nhien: \n");
		for(i=0;i<h;i++)
		{
			System.out.println();
			for(j=0;j<c;j++)
				System.out.printf("%15d",a[i][j]);
		}
		//in ptu tai hang k
		int k,s;
		do {
		System.out.print("\n nhap k:");
		k=sc.nextInt();
		}while(k<1&&k>h);
		System.out.println("\n phan tu hang "+k+":");
		
			for(j=0;j<c;j++)
		{
			System.out.print(a[k][j]+"\t");
		}
		
	}}

