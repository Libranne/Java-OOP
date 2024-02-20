import java.io.Serializable;
import java.util.*;

import TienThuong.TienThuong;
/* co che ghi trang thai tu doi tuong sang byte*/
public class GiangVien extends Person implements TienThuong , Serializable{
    private String chuyenNganh;
    private int soCTNC;
    private float hsl,luongCB;
    
    public GiangVien( String chuyenNganh, String hocHam,int soCTNC, float hsl,float luongCB)
    {
        super();
        this.chuyenNganh=chuyenNganh;
        this.soCTNC=soCTNC;
        this.hsl=hsl;
        this.luongCB=luongCB;
    }
    public GiangVien(){super();}

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public int getSoCTNC() {
        return soCTNC;
    }

    public float getHsl() {
        return hsl;
    }

    public float getLuongCB() {
        return luongCB;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public void setSoCTNC(int soCTNC) {
        this.soCTNC = soCTNC;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }

    @Override
    public String toString() {
        return "GiangVien{"+super.toString() + ",ChNganh=" + chuyenNganh + 
                ",soCTNC=" + soCTNC + ",hsl=" + hsl + 
                ",luongCB=" + luongCB + ",TienThuong="+tinhTienThuong()+'}';
    }
    public void nhap()
    {
        super.nhap();
        sc.nextLine();
        System.out.print("Nhap chuyen nganh: ");
        chuyenNganh= sc.nextLine();
        System.out.print("Nhap so cong trinh nghien cuu: ");
        soCTNC=sc.nextInt();
        System.out.print("Nhap he so luong: ");
        hsl=sc.nextFloat();
        System.out.print("Nhap luong CB: ");
        luongCB =sc.nextFloat();
    }
    public float tinhTienThuong()
    {
        return this.hsl*this.luongCB*0.7f;
    }
}
