import java.util.*;

import TienThuong.TienThuong;
public class Person implements TienThuong {

    protected String hoTen;
    protected String ma;
    protected int tuoi;
    protected String gioiTinh;
    protected float hsl;
    protected float luongCB;
    protected float diemRL;
    protected float diemTL;
    protected int soCTNC;
    protected int soCVHT;
    
    Scanner sc= new Scanner(System.in);
    public Person(String ma, int tuoi, String hoTen, String gioiTinh) {
        super();
        this.hoTen = hoTen;
        this.ma = ma;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }

    public Person() {
        super();
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMa() {
        return ma;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return  "hoTen=" + hoTen + ",ma=" + ma + ",tuoi=" + tuoi + ",gioiTinh=" + gioiTinh;
    }
    public void nhap()
    {
        System.out.print("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.print("Nhap ma: ");
        ma=sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi=sc.nextInt();
        System.out.print("Nhap gioi tinh(nam/nu): ");
        do {
        gioiTinh=sc.nextLine();  
        } while (!gioiTinh.equals("nam") && !gioiTinh.equals("nu"));
    }
     public float tinhTienThuong()
    {
        return 0;
    }
     public float getDiemTL() {
        return diemTL;
    }
     public float getDiemRL() {
        return diemRL;
    }
     public int getSoCTNC() {
        return soCTNC;
    }
     public int getSoCVHT() {
        return soCVHT;
    }

	}
