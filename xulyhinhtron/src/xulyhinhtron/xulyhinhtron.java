package xulyhinhtron;



public class xulyhinhtron {
	public static void main(String[] args) {
		hinhtron x= new hinhtron();
		hinhtron y= new hinhtron();
		x.nhap();
		y.nhap();
		
		x.xuat();
		y.xuat();
		
		System.out.println("\n-----------");
		System.out.println(x.toString());
		System.out.println(y.toString());
		
		System.out.println("\n--------------------");
		x.setR(4);
		x.xuat();
	}
}
