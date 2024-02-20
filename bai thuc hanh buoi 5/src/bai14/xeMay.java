package bai14;

public class xeMay extends xe implements thueXe{
	public double tinhThue() {
        return getGiaTri() *(getThue() + getVat());
    }

    
    public double getGiaTri() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getVat() {
        return 0.1;
    }

    
    public double getThue() {
        return 0.05;
    }

}
