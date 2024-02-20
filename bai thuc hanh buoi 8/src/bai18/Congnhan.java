package bai18;
import java.io.Serializable;
public class Congnhan extends Connguoi implements Serializable{
	 static float hsl =1.92f;
	   static float luongCB=450000;
	   private float tienthuong;
	   
	   public Congnhan()
	   {
	       super();
	   }

	    @Override
	    public String toString() {
	        return "Congnhan{"+super.toString()+", luong="+tinhluong()+ ", tienthuong"+tienThuong()+'}';
	    }
	   
	   public float tinhluong()
	   {
	       return hsl*luongCB+0.2f*luongCB*this.getSoNamCT();
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
