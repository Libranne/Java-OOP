/*Lập trình tính diện tích tam giác theo công thức Heron*/
package bai2;

import java.util.Scanner;

public class bai2 {
	public static void main(String arg[])
	{
		float a,b,c,s,p;
		Scanner sc= new Scanner (System.in);
		
		System.out.println("nhap canh a:");
		a= sc.nextFloat();
		System.out.println("nhap canh b:" );
		b= sc.nextFloat();
		System.out.println("nhap canh c:" );
		c= sc.nextFloat();
		 if (a >= b + c || b >= a + c || c >= a + b)
			 System.out.println("Ba canh vua nhap khong phai la canh cua tam giac");
		    else {
		p=(a+b+c)/2;
		s=(p*(p - a)*(p - b)*(p - c));
	
		   System.out.println("dien tich tam giac theo cong thuc heron:"+Math.sqrt(s));
		
	}}

	

	

}
