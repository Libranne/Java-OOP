/* Viết chương trình nhập vào số nguyên n và Thực hiện
Xuất ra màn hình n số đầu tiên của chuỗi Fibonaci (có hai giá trị đầu là 1 và 1)*/
package bai3;

import java.util.Scanner;

public class bai3 {
	public static void main(String arg[])
	{
		int n;
		Scanner sc= new Scanner (System.in);
		System.out.print(" nhap n:");
		n=sc.nextInt();
		int f1=0,f2=1,fi;
		   fi=f2;
		   System.out.print(n+" so fibonaci dau tien la:");
		   for(int i = 1;i <= n ;i ++)
		   {
			 
			   System.out.print( fi+" ");
		        fi=f1+f2;
		        f1=f2;
		        f2=fi;
		   }
		  
	}

}
