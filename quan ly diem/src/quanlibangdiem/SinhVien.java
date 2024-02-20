/*Viết chương trình quản lý điểm của một lớp tín chỉ, yêu cầu
Nhập và in lại danh sách SV đó
Cho biết tên sinh viên có Điểm học phần <4
…
Lưu bảng điểm vào file “bangdiem.dat”
Đọc  từ file “bangdiem.dat”
Yêu cầu: Sử dụng ArrayList để lưu danh sách các sinh viên, bang điểm theo mẫu*/
package quanlibangdiem;

import java.util.Scanner;

public class SinhVien /*implements Serializable*/{
	private String smasv;
	private String shoten;
	private String sngaysinh;
	private String slophc;
	private float fddiemcc, fddiemgk, fddiemthi;
	
	public SinhVien()
	{
		
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap masv:");
		smasv= sc.nextLine();
		System.out.println(" nhap ho ten:");
		shoten = sc.nextLine();
		System.out.println(" nhap ngay sinh:");
		sngaysinh = sc.nextLine();
		System.out.println("nhap lop HC:");
		slophc = sc.nextLine();
		System.out.println(" nhap diem cc:");
		fddiemcc = sc.nextFloat();
		System.out.println(" nhap diem giua ky:");
		fddiemgk = sc.nextFloat();
		System.out.println("nhap diem thi:");
		fddiemthi= sc.nextFloat();
	}
	public void xuat()
	{
		System.out.printf("\n %10s",smasv);
		System.out.printf("%15s",shoten);
		System.out.printf("%12s",sngaysinh);
		System.out.printf("%10s",slophc);
		System.out.printf("%6.1f",fddiemcc);
		System.out.printf("%6.1f",fddiemgk);
		System.out.printf("%6.1f",fddiemthi);
	}
	public float diemhocphan()
	{
		return 0.1f*fddiemcc + 0.2f*fddiemgk + 0.7f*fddiemthi;
	}
	public String getten()
	{
		return shoten;
	}

}
