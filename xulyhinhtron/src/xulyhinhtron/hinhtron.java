/*Áp dung: Tạo một đối tượng hình tròn, gọi phương thức nhập hình tròn và hiện chu vi, diện tích của hình tròn.*/
package xulyhinhtron;

import java.util.Scanner;

public class hinhtron{
	
	// khai bao cac thuoc tinh
			private float R;
			// dinh nghia phuong thuc 
			public void nhap()
			{ Scanner sc=new Scanner(System.in);
			System.out.println(" nhap ban kinh:");
			R=sc.nextFloat();
			}
				public void xuat()
				{
					System.out.println("\n ban kinh:"+R);
					System.out.println("\n dien tich:"+dientich());
					System.out.println("\n chu vi:"+chuvi());
				}
				
				
				public float dientich() {
					return (float)Math.PI*R*R;
				}
				public float chuvi()
				{
					return 2*3.14f*R;
				}	
				public String toString()
				{
					return "\n("+R+","+dientich() +","+ chuvi()+ ")";
				}
				public float getR() { return R;}
				public void setR( float rr) {R= rr; }
}
