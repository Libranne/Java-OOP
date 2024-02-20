package kethuavatinhdahinh;
import java.io.*;
import java.util.Scanner;

public class Person {
	private String manv;
	private String hoten;
	private String gioitinh;
	private String ngaysinh;
	private float hesl;
	
	public Person() {
		manv="noID";hoten="noID";gioitinh="noID";
		ngaysinh ="noID";hesl=0;
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap ma nv:");
		manv=sc.nextLine();
		System.out.println("nhap ho ten:");
		hoten=sc.nextLine();
		System.out.println("nhap gioi tinh:");
		gioitinh=sc.nextLine();
		System.out.println("nhap ngay sinh:");
		ngaysinh=sc.nextLine();
		System.out.println("nhap he sl:");
		hesl=sc.nextFloat();
		
	}
	public void xuat()
	{
		System.out.printf("\n %%10s,manv");
		System.out.printf("%20s,hoten");
		System.out.printf(" %5s,gioitinh");
		System.out.printf("%12s,ngaysinh");
		System.out.printf("%7.1fs,hesl");
	}
	public float tinhluong()
	{
		return hesl * 1500000;
	}
	public String gethocham( ) {
		return "";
	}
	

}
