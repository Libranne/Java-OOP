import java.io.Serializable;

import TienThuong.TienThuong;

public class GVKhenThuong extends Person  implements TienThuong ,Serializable{
	 	
	    private int SLduocKT;

		public int getSLduocKT() {
			return SLduocKT;
		}
		public void setSLduocKT(int sLduocKT) {
			SLduocKT = sLduocKT;
		}
	    
		@Override
	    public String toString() {
	        return "GiangVien{"+super.toString() +  ",solanKT:"+ SLduocKT+ ",TienThuong="+tinhTienThuong()+ '}';
	    }
	    public void nhap()
	    {
	        super.nhap();
	        sc.nextLine();
	        
	        System.out.println("nhap so lan duoc khen thuong:");
	        SLduocKT=sc.nextInt();
	    }
	    public float tinhTienThuong()
	    {
	        return this.SLduocKT*100000;
	    }

}
