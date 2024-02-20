package bai4;

import java.util.Scanner;

public class DShs {
	// khai bao thuoc tinh
			int n;
			hocsinh ds[];
			// dinh nghia cac phuong thuc
			public void nhapDShs() 
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("nhap so hoc sinh:");
				n=sc.nextInt();
				ds= new hocsinh[n];
				
				for(int i=0;i<n;i++)
				{
					ds[i]= new hocsinh();
					ds[i].nhap();
					System.out.println("\n --------------");
				}
			}
			public void xuatDShs()
			{
				System.out.println("\n Danh sach hoc sinh:");
				for(int i=0;i<n;i++)
					ds[i].xuat();
				
			}
			public void tinhtongtienan()
			{
				float s=0;
				for(int i=0;i<n;i++)
					s=s + ds[i].tongtienan();
				System.out.print("\n tong tien an:"+ s);
			}
			
			 hocsinh tg = new hocsinh();
			public void sapxephs()
			{
				for(int i=0;i<n-1;i++)
					for(int j=i+1;j<n;j++)
						if( ds[i].tongtienan() > ds[j].tongtienan())
						{
							tg = ds[i];
							ds[i] =ds[j];
							ds[j]= tg;
						}
				System.out.println( "\n theo thu tu tang dan cua tien an:");
				xuatDShs();
			}
			public void sobuoian20()
			{
				int m ;
				System.out.println("\n danh sach hoc sinh co so buoi an tren 20:");
				
				for(int i=0;i< n;i++)
					if(ds[i].sobuoian>20) xuatDShs();
			}
			
}
