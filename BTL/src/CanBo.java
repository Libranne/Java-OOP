import java.io.Serializable;
import java.util.*;
import TienThuong.TienThuong;

public class CanBo extends Person implements TienThuong ,Serializable{
    private String chucVu;
    private float hsl, luongCB;
    private int soCVHT;
    private float phucapCV;
    
    public CanBo( String chucVu, float hsl,int soCVHT, float luongCB,float phucapCV)
    {
        super();
        this.chucVu=chucVu;
        this.hsl=hsl;
        this.soCVHT=soCVHT;
        this.luongCB=luongCB;
        this.phucapCV=phucapCV;
    }
    public CanBo()
    { super();}

    public String getChucVu() {
        return chucVu;
    }

    public float getHsl() {
        return hsl;
    }

    public float getLuongCB() {
        return luongCB;
    }

    public int getSoCVHT() {
        return soCVHT;
    }

    public double getPhucapCV() {
        return phucapCV;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }

    public void setSoCVHT(int soCVHT) {
        this.soCVHT = soCVHT;
    }

    public void setPhucapCV(float phucapCV) {
        this.phucapCV = phucapCV;
    }

    @Override
    public String toString() {
        return "CanBo{"+ super.toString() + 
                ",chucVu=" + chucVu + ",hsl=" + hsl + 
                ",luongCB=" + luongCB + ",soCVHT=" + soCVHT +
                ",PC=" + phucapCV + ",TienThuong="+tinhTienThuong()+'}';
    }
    public void nhap()
    {
        super.nhap();
        sc.nextLine();
        System.out.print("Nhap chuc vu: ");
        chucVu=sc.nextLine();
        System.out.print("Nhap so cong viec hoan thanh: ");
        soCVHT=sc.nextInt();
        System.out.print("Nhap luongCB: ");
        luongCB=sc.nextFloat();
        System.out.print("Nhap he so luong: ");
        hsl=sc.nextFloat();
        System.out.print("Nhap phu cap: ");
        phucapCV=sc.nextFloat();
    }
    public float tinhTienThuong()
    {
        return (this.hsl+this.phucapCV)*this.luongCB;
    }
}
	

