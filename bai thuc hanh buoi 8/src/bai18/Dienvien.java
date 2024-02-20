package bai18;
import java.io.Serializable;
public class Dienvien extends Connguoi implements Serializable{
	 static float hsl = 3.2f;
	    static float luongCB = 450000;
	    private float tienthuong;

	    public Dienvien() {
	        super();
	    }

	    @Override
	    public String toString() {
	        return "Dienvien{" + super.toString() + ", luong=" + tinhluong() +", tienthuong"+tienThuong()+ '}';
	    }

	    public float tinhluong() {
	        return hsl * luongCB + 0.1f * luongCB * this.getSoNamCT();
	    }
	    public float tienThuong()
	   {
	       if(this.getSoNamCT()<5)
	       {
	         tienthuong= 300000;
	       }
	       else if( this.getSoNamCT()>=5 && this.getSoNamCT()<=10)
	       { tienthuong= 500000;}
	       else {tienthuong =1000000;}
	       return tienthuong;
	   }
	

}
