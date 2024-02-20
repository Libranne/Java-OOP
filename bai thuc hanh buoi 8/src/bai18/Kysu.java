package bai18;
import java.io.Serializable;
public class Kysu  extends Connguoi implements Serializable{
	static float hsl = 2.34f;
    static float luongCB = 450000;
    private float tienthuong;

    public Kysu() {
        super();
    }

    
    public String toString() {
        return "Kysu{" + super.toString() + ", luong=" + tinhluong() +", tienthuong"+tienThuong()+ '}';
    }

    public float tinhluong() {
        return hsl * luongCB + 0.3f * luongCB * this.getSoNamCT();
    }

    public float tienThuong() {
        if (this.getSoNamCT() < 5) {
            tienthuong = 300000;
        } else if (this.getSoNamCT() >= 5 && this.getSoNamCT() <= 10) {
            tienthuong = 500000;
        } else {
            tienthuong = 1000000;
        }
        return tienthuong;
    }
	

}
