package xulyxaukytu;

import java.util.Scanner;

public class nhap {
	public static void main(String arg[]) {
		int a[]= {2,4,6,8};
		for(int i=0;i<a.length;i++)
			System.out.printf("%5d",a[i]);
	
	int n,s;
	Scanner sc= new Scanner(System.in);
	System.out.println("\n nhap n:");
	n=sc.nextInt();
	s=0;
	for(int i=0;i<=n;i++)
		if(i%2==1)
			s=s+i;
	System.out.print("\n tong cac so le:"+ s);
	
	
}

}
