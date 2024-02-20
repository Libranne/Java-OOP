package bai13;
import java.io.*;
import java.util.Scanner;

public class CanBo extends Person {
	private String donvi;
	private String vitri;
	private String nhiemvu;
	private float luongtangthem;
	public CanBo()
	{
		super();
		donvi=""; vitri="";	nhiemvu="";	luongtangthem=0;
	}
	public void nhap()
	{
		super.nhap();
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap don vi:");
		donvi=sc.nextLine();
		System.out.println("nhap vi tri:");
		vitri=sc.nextLine();
		System.out.println("nhap nhiem vu:");
		nhiemvu=sc.nextLine();
		System.out.println("nhap luong tang them:");
		luongtangthem=sc.nextFloat();
	}
	public void xuat()
	{
		super.xuat();
		System.out.printf("%15s,donvi");
		System.out.printf("%15s,vitri");
		System.out.printf("%15s,nhiemvu");
		System.out.printf("%12.0f,luongtangthem");
	}
	public float tinhluong()
	{
		return super.tinhluong() + luongtangthem;
	}
	
	

}
