package nhansuhsgiaovien;

import java.util.ArrayList;
import java.util.Scanner;

public class kethua {
	public static void main(String[] args)
	{
		ArrayList<hocsinh> lstHS = new ArrayList();
		ArrayList<giaovien> lstGV = new ArrayList();
		int sohs,sogv;
		int chon;
		do
		{
			System.out.println("\n 1. nhap DSHS");
			System.out.println("\n 2. nhap DSGV");
			System.out.println("\n 3. in DSHS");
			System.out.println("\n 4. in DSGV");
			System.out.println("\n 0. thoat chuong trinh");
			System.out.println("\n  moi ban chon:");
		
			chon=(new Scanner(System.in).nextInt());
			
			switch(chon)
			{
			case 1:
				System.out.println("nhap so HS:");
				sohs=(new Scanner(System.in)).nextInt();
				for(int i=0;i<sohs;i++)
				{
					hocsinh hs= new hocsinh();
					hs.nhap();
					lstHS.add(hs);
				}
				break;
			case 2:
				System.out.println("nhap so GV:");
				sogv=(new  Scanner(System.in)).nextInt();
				for(int i=0;i<sogv;i++)
				{
					giaovien gv= new giaovien();
					gv.nhap();
					lstGV.add(gv);
			}
				break;
			case 3:
				System.out.println("\n \n DS hoc sinh:");
				for(hocsinh hs: lstHS) {
					hs.xuat();}
				break;
			case 4:
				System.out.println("\n \n DS giao vien:");
				for(giaovien gv: lstGV) {
					gv.xuat();}
				break;
			case 0:
				System.exit(0);
			} 
}while (chon!=0);
}
}
		
	

			
