/*Sở giao thông cần theo dõi việc đăng ký xe của người dân. Dựa vào thông tin trị giá xe và dung tích xylanh của xe, sở giao thông cũng tính mức thuế phải đóng trước bạ khi mua xe như sau: 
Dưới 100cc, 1% trị giá xe. 
Từ 100 đến 200cc, 3% trị giá xe. 
Trên 200cc, 5% trị giá xe.
Hãy thiết kế và cài đặt class PhuongTien với các Thuộc tính và Phương thức phù hợp. 
Xây dựng class để quản lý danh sách phương tiện, với các yêu cầu
1. Nhập thông tin
In lại danh sách thông tin các phương tiện
3. Tính tổng tiền thuế của các phương tiện*/
package PhuongTien;

import java.util.Scanner;

public class phuongtien {
		// dinh nghia thuoc tinh
	private String tenchuxe;
	private String loaixe;
	private int dungtich;
	private float trigia;
	//dinh nghia cac phuong thuc
	public phuongtien()
	{
		tenchuxe="noname"; loaixe="noID";   dungtich=0;   trigia=0;
	}
	public phuongtien(String ten,String loai,int dt,float tg)
	{
		this.tenchuxe= ten;      this.loaixe= loai;
		this.dungtich= dt;			this.trigia=tg;
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n nhap ten chu xe:");
		tenchuxe=sc.nextLine();
		System.out.println("\n nhap loai xe:");
		loaixe=sc.nextLine();
		System.out.println("\n nhap dung tich xe:");
		dungtich=sc.nextInt();
		System.out.println("\n nhap ten tri gia:");
		trigia=sc.nextFloat(); //sc.nextline(); chong troi
	}
	public float tinhthue()
	{
		if (dungtich <100) return 0.01f*trigia;
		else if(dungtich <200) return 0.03f*trigia;
		else 	return 0.05f* trigia;
	}
	public void hien()
	{
		System.out.printf("\n %20s",tenchuxe);
		System.out.printf("%20s",loaixe);
		System.out.printf("%8d",dungtich);
		System.out.printf("%15.0f",trigia);
	}
}
