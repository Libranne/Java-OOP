package Vidu10;

import java.util.Scanner;

public class Vidu10 {
	public static void main(String arg[]) {
		float a,b,c,s;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("nhap a:" );
		a= sc.nextFloat();
		System.out.println("nhap b:" );
		b= sc.nextFloat();
		s=a*b;
		c=(a+b)*2;
		System.out.print("\n dien tich:"+s);
		System.out.printf("\n chu vi: %10.0f",c);
	}

	}


