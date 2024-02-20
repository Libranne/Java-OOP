package kethuavatinhdahinh;
import java.io.*;
import java.util.Scanner;

public class GiangVien extends Person {
	private String chuyennganh;
	private String hocham;
	private String mongd;
	private int sotietvuot;
	public GiangVien()
	{
		super();
		chuyennganh=""; hocham=""; mongd="";	sotietvuot=0;
	}
	public void nhap()
	{
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chuyen nganh:");
		chuyennganh=sc.nextLine();
		System.out.println("nhap hoc ham:");
		hocham=sc.nextLine();
		System.out.println("nhap mon gd:");
		mongd=sc.nextLine();
			System.out.println("nhap so tiet vuot:");
		sotietvuot=sc.nextInt();
			
		
	}
	public void xuat()
	{
		super.xuat();
		System.out.printf("%15s",chuyennganh);
		System.out.printf("%15s",hocham);
		System.out.printf("%15s",mongd);
		System.out.printf("%8d",sotietvuot);
	}
	public float tinhluong()
	{
		float dinhmuctt=0;
		if(hocham.equals("Ths")==true)
			dinhmuctt=100000;
		else if(hocham.equals("TS")==true)
			dinhmuctt=130000;
		return super.tinhluong() + sotietvuot*dinhmuctt;
	}
	public String gethocham( ) {
		return hocham;
	}

}
