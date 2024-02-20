package bai13;
import java.io.*;
import java.io.IOException;

public class quanly_canbo_giangvien {
	public static void main(String[] args) 
	throws IOException {
		DSNhanVien khoacntt= new DSNhanVien();
		khoacntt.nhap();
		khoacntt.xuat();
		khoacntt.tinhtongluong();
	}

}
