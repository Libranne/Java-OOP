package quanlibangdiem;

import java.io.FileNotFoundException;
import java.io.IOException;

public class mainquanli {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		bangdiem lthdt= new bangdiem();
		lthdt.nhap();
		lthdt.luubdfile();
		lthdt.docbdfile();
		//lthdt.xuat();
		lthdt.xuatsvhoclai();
	}

}
