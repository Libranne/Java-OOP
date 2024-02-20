package bai18;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class Main {
	public static void main (String args[])  throws FileNotFoundException,IOException,ClassNotFoundException {
		int chon;
		Scanner sc= new Scanner(System.in);
		DSNV x= new DSNV();
		 
		do {
			System.out.print("\n 1.Nhap DSNS luu vao file");
			System.out.print("\n 2. xuat DSNS");
			System.out.print("\n 3. danh sach thuong tet");
			System.out.print("\n 4. Danh sach nguoi gia nhat,tre nhat");
			System.out.print("\n 5. Danh sach dien vien luong cao nhat");
			System.out.print("\n 6. Tien luong toan bo nhan su");
			System.out.print("\n 7. Moi loai lao dong co bao nhieu nguoi");
			System.out.print("\n 0. dung chuong trinh");
			System.out.print("\n moi ban chon:");
			chon = sc.nextInt();
			
			switch(chon)
			{
			case 1:x.nhap(); break;
			case 2:x.hien(); break;
			case 3:x.luuFile(); break;
			case 4:x.docFile();break;
			//case 5:x.sapxepluongchuaphucap();break;
			case 0: System.exit(0);
			
			}
			} while(chon!=0);
		}

}
