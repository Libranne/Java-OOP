package bai9;

import java.util.Scanner;



public class chayct {
	public static void main(String[] args) {
		
			int chon;
			Scanner sc= new Scanner(System.in);
			DSCN cn= new DSCN();
			Congnhan.setluongcb(1150);
			cn.nhapDSCN();
			cn.xuatDSCN();
			//cn.sosanh();
			cn.tinhtongluong();
			cn.tinhtongluongcoPC();
			cn.tienchenhlech();
	}

}
