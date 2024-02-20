package quanlibangdiem;
import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class bangdiem {
	private String smonhoc;
	private String sgiaovien;
	private String shk;
	private String snamhoc;
	private String sngaythi;
	
	ArrayList<SinhVien> lstSV;
	 public void bangdiem() {}
	 
	 public void nhap()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" nhap mon hoc:");
		 smonhoc= sc.nextLine();
		 System.out.println(" nhap giao vien:");
		 sgiaovien = sc.nextLine();
		 System.out.println("nhap hoc ky:");
		 shk =sc.nextLine();
		 System.out.println("nhap nam hoc:");
		 snamhoc=sc.nextLine();
		 System.out.println(" nhap ngay thi:");
		 sngaythi= sc.nextLine();
		 int n;
		 System.out.println("nhap so sv:");
		 n = sc.nextInt();
		 lstSV = new ArrayList<SinhVien>();
		 for(int i=0;i<n;i++)
		 {
			 SinhVien x = new SinhVien();
			 x.nhap();
			 lstSV.add(x);
			 
		 }
	 }
	 public void xuat()
	 {
		 System.out.printf("\n mon hoc:%s", smonhoc);
		 System.out.printf("\n giao vien:%s",sgiaovien);
		 System.out.printf("\n hoc ky:%s",shk);
		 System.out.printf("\n nam hoc:%s",snamhoc);
		 System.out.printf("\n ngay thi:%s",sngaythi);
		 for(SinhVien x:lstSV)
			 x.xuat();
		 System.out.println("\n--------------");
	 }
	 public void xuatsvhoclai()
	 {
		 System.out.println("\n danh sach sinh vien hoc lai: \n");
		 for(SinhVien x: lstSV)
			 if ( x.diemhocphan() < 4)
				 System.out.println(x.getten());
	 }
	 public void luubdfile()
	 throws FileNotFoundException, IOException
	 {
		 File f = new File("dssinhvien.dat");
		 FileOutputStream fout = new FileOutputStream(f);
		 ObjectOutputStream out = new ObjectOutputStream(fout);
		 
		 out.writeObject(lstSV);
		 
		 out.close();
		 fout.close();
		 
	 }
	 public void docbdfile()
	 throws FileNotFoundException,IOException, ClassNotFoundException
	 {
		 File f= new File("dssinhvien.dat");
		 
		 FileInputStream fin = new FileInputStream(f);
		 ObjectInputStream in = new ObjectInputStream(fin);
		  lstSV = new ArrayList<SinhVien>();
		  lstSV = (ArrayList)in.readObject();
		  
		  in.close();
		  fin.close();
	 }

	 public void sapxepDSSVDiemhocphan()
	 {
		 Collections.sort(lstSV,new SVcomparator() );
		 xuat();
	 }
	 public void sapxepDSSVten()
	 {
		 Collections.sort(lstSV,new SVhotencomparator() );
		 xuat();
	 }
}
