package bai10;
import java.util.Scanner;

public class TuLanh extends MatHang {
	private int dungTich;
    private String mauSac;
    private String hangSX;
    private int soLuong;
    private float donGia;
    
    public TuLanh(String mauSac, String hangSX, int dungTich, int soLuong, float donGia)
    {
        super();
        this.mauSac=mauSac;
        this.hangSX=hangSX;
        this.donGia=donGia;
        this.soLuong=soLuong;
        this.dungTich=dungTich;
    }
    public TuLanh()
    {
        super();
    }
     public String getMauSac()
    { return mauSac;}
    public void setMauSac( String mauSac)
    { this.mauSac=mauSac;}
    public String getHangSX()
    { return hangSX;}
    public void setHangSX( String hangSX)
    { this.hangSX=hangSX;}
    public int getDungTich()
    {
        return dungTich;
    }
    public void setDungTich( int dungTich)
    {
        this.dungTich=dungTich;
    }   
    public int getSoLuong()
    {
        return soLuong;
    }
    public void setSoLuong( int soLuong)
    {
        this.soLuong=soLuong;
    }   
    public float getDonGia()
    {
        return donGia;
    }
    public void setDonGia( float donGia)
    {
        this.donGia=donGia;
    }   
    public String toString()
    {
        return super.toString()+",TuLanh[ HangSX="+hangSX+",MauSac="+mauSac+",DungTich="+dungTich+",soLuong="+soLuong+",DonGia="+donGia+",ThanhTien="+ThanhTien()+"]";
    }
    public float ThanhTien(){return donGia*soLuong;}
    void nhap()
    {
        super.nhap();
        System.out.print("Nhap Hang SX: ");
        hangSX = new Scanner(System.in).nextLine();
        System.out.print("Nhap Mau Sac: ");
        mauSac= new Scanner(System.in).nextLine();
        System.out.print("Nhap Dung Tich: ");;
        dungTich = sc.nextInt();
        System.out.print("Nhap So luong: ");;
        soLuong = sc.nextInt();
        System.out.print("Nhap Don Gia: ");;
        donGia = sc.nextFloat();
        
    }

}
