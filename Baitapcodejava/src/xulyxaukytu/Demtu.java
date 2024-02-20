/*Viết chương trình nhập vào chuỗi ký tự
In lại chuỗi đã nhập
Tìm kiếm xem có chuỗi x (được nhập từ bàn phím) nào đó có trong chuỗi hay không
Đếm xem chuỗi đã nhập có bao nhiêu từ
Ví dụ:
S = “Khoa Cong nghe thong tin – Dai hoc mo HN”
x = “Cong nghe” => “có xuất hiện”
Số từ trong chuỗi s: 9*/
package xulyxaukytu;

import java.util.Scanner;

public class Demtu {
	public static void main(String arg[]) {
		String s= new String();
		Scanner sc=new Scanner(System.in);
		System.out.print("\n nhap chuoi:");
		s=sc.nextLine();
		System.out.print("\n chuoi da nhap:"+s);
		String x=new String();
		System.out.print("\n chuoi can tim:");
		x=sc.nextLine();
		int vitri=s.indexOf(x);
		if(vitri==-1)
			System.out.println("\n khong tim thay");
		else
			System.out.println("\n tim thay tai vi tri:"+vitri);
		// dem so tu trong chuoi
		s=s.trim();
		int dem; 
		if(s.length()>0)
			dem=1;
		else dem=0;
		for(int i = 0;i<s.length();i++)
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
				dem=dem+1;
		System.out.print("\n so tu cua chuoi:"+dem);
		
		
	}

}
