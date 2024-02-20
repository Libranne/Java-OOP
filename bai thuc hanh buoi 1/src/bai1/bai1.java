/*Viết chương trình nhập vào một mảng các số nguyên từ
bàn phím. Thực hiện:
- In lại các phần tử mảng đã nhập
- Tính tổng các phần tử mảng
- In các phần tử lẻ có trong mảng
- Cho biết giá trị và vị trí phần tử nhỏ nhất có trong mảng*/
package bai1;

import java.util.Scanner;

public class bai1 {
	public static void main( String arg[]) 
	{
		int a[],s,minn;
	
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
		
		// ptu le
		System.out.print("\n cac phan tu le co trong mang : ");
		for(i=0;i<n;i++)
		if(a[i]%2==1)
		System.out.print(" "+a[i]);
			
		// min
		
		minn=a[0];
		for(i=1;i<n;i++)
			if(minn>a[i]) minn=a[i];
		System.out.print("\n gia tri nho nhat co trong mang:"+minn);
		System.out.print("\nVi tri cua phan tu nho nhat:");
	    for( i = 0; i < n; i++){
	        if(a[i] == minn)
	            System.out.print(" "+"a["+i+"]");
	        }
	}


}
