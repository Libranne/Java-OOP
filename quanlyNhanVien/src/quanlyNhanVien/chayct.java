package quanlyNhanVien;

import java.util.Scanner;

public class chayct {
	public static void main (String args[]) {
	int chon;
	Scanner sc= new Scanner(System.in);
	DSNV phonga= new DSNV();
	NhanVien.setluongcb(1800000); // khoi gan luong cb
	do {
		System.out.print("\n 1.Nhap DSNV");
		System.out.print("\n 2. xuat DSNV");
		System.out.print("\n 3. tinh tong luong DSNV");
		System.out.print("\n 4. tinh tong luong co pc DSNV");
		System.out.print("\n 5. sap xep DSNV");
		System.out.print("\n 0. dung chuong trinh");
		System.out.print("\n moi ban chon:");
		chon = sc.nextInt();
		
		switch(chon)
		{
		case 1:phonga.nhapDSNV(); break;
		case 2:phonga.xuatDSNV(); break;
		case 3:phonga.tinhtongluong(); break;
		case 4:phonga.tinhtongluongcoPC();break;
		case 5:phonga.sapxepluongchuaphucap();break;
		case 0: System.exit(0);
		
		}
		} while(chon!=0);
	}
}


