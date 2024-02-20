package nhansuhsgiaovien;

import java.util.Scanner;

public class NhanSu {
	private String hoten;
	private int namsinh;
	private String quequan;
	
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" nhap ho ten:");
		hoten= sc.nextLine();
		System.out.println("nhap que quan:");
		quequan=sc.nextLine();
		System.out.println("nhap nam sinh:");
		namsinh=sc.nextInt();
		
	}
	public void xuat()
	{
		System.out.printf("\n %15s",hoten);
		System.out.printf("%7d",namsinh);
		System.out.printf("%15s",quequan);
	}

}
