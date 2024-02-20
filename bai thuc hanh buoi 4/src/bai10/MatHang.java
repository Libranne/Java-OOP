package bai10;

import java.util.Scanner;

public class MatHang {
	private String tenHang;
    private String nuocSX;
    private int maHang;
    Scanner sc= new Scanner(System.in);
    public MatHang(String tenHang, String nuocSX, int maHang)
    {
        super();
        this.tenHang=tenHang;
        this.nuocSX=nuocSX;
        this.maHang=maHang;
    }
    public MatHang()
    {
     super();    
    }
    
    public String getTenHang()
    { return tenHang;}
    public void setTenHang( String tenHang)
    { this.tenHang= tenHang;}
    public String getNuocSX()
    { return nuocSX;}
    public void setNuocSX( String nuocSX)
    { this.nuocSX= nuocSX;}
    public int getMaHang()
    {
        return maHang;
    }
    public void setMaHang( int maHang)
    {
        this.maHang=maHang;
    }        
    public String toString()
    {
        return "MatHang [ TenHang="+tenHang+",NuocSX="+nuocSX+",MaHang="+maHang+"]";
    }
    void nhap()
    {
         System.out.print("Nhap Ten Hang: ");
        tenHang = sc.nextLine();
        System.out.print("Nhap NuocSX: ");
        nuocSX= sc.nextLine();
        System.out.print("Nhap Ma Hang: ");;
        maHang = sc.nextInt();
    }

}
