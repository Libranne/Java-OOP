package bai14;

public class quanlyXe {
	public static void main(String[] args) {
        xeDap x= new xeDap();
        x.nhap();
        System.out.println(""+x.toString());
        System.out.println("nhap xe may");
        xeMay y= new xeMay();
        y.nhap();
        System.out.println(""+y.toString()+" "+y.tinhThue());
        
    }

}
