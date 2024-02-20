package Vidu10;

import java.util.Scanner;

public class tongsole {
	public static void main(String arg) {
		int n,s;
		Scanner sc= new Scanner(System.in);
		System.out.print(" nhap n:");
		n=sc.nextInt();
		s=0;
		for(int i=0;i<=n;i++)
			if(i%2==1)
				s=s+i;
		System.out.print("\n tong cac so le:"+ s);
		
		
	}

}
