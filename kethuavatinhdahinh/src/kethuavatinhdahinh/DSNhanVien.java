package kethuavatinhdahinh;
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class DSNhanVien {
	ArrayList<Person> lstNV=new ArrayList<Person>();
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("nhap so luong nhan vien:");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("ban muon nhap gi?(1-canbo;2-giangvien):");
		int chon = sc.nextInt();
		if(chon==1)
		{
			CanBo cb=new CanBo();
			cb.nhap();
			lstNV.add(cb);
		}
		else if(chon==2)
		{
			GiangVien gv= new GiangVien();
					gv.nhap();
			lstNV.add(gv);
		}
		else
		{
			System.out.println("\n ban nhap sai:");
			i--;
		}
		/*
		 //-------------------
		 
		 switch(chon)
		 {
		 case 1:*/
		}
	}
	public void xuat()
	{
		System.out.println("\n DS NHAN VIEN \n");
		for(Person pr: lstNV)
			pr.xuat();
	}
	float tinhtongluong()
	{
		float s=0;
		for(Person pr:lstNV)
			s=s+pr.tinhluong();
		return s;
	}
	public void inDSGiangVien()
	{
		System.out.println("\n danh sach giang vien \n");
		for(Person pr: lstNV)
			if(pr instanceof GiangVien )
				pr.xuat();
	}
	public void inDSGiangVienThacSy()
	{
		System.out.println("\n danh sach giang vien \n");
		for(Person pr: lstNV)
			if(pr instanceof GiangVien && pr.gethocham().equals("Ths")== true)
				pr.xuat();
	}
	public void luufile()
	
		
				 throws FileNotFoundException, IOException
				 {
					 File f = new File("nhanvien.dat");
					 FileOutputStream fout = new FileOutputStream(f);
					 ObjectOutputStream out = new ObjectOutputStream(fout);
					 
					 out.writeObject(lstNV);
					 
					 out.close();
					 fout.close();
	}
	public void docfile()
			 throws FileNotFoundException,IOException, ClassNotFoundException
			 {
				 File f= new File("nhanvien.dat");
				 
				 FileInputStream fin = new FileInputStream(f);
				 ObjectInputStream in = new ObjectInputStream(fin);
				  lstNV = new ArrayList<Person>();
				  lstNV = (ArrayList)in.readObject();
				  
				  in.close();
				  fin.close();
			 }
	

}
