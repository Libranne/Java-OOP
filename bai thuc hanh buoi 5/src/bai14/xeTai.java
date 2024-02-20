package bai14;

public class xeTai extends xe implements thueXe{
	public double tinhThue() {
        return getGiaTri() * (getThue() + getVat());
    }

    
    public double getVat() {
        return 0.1;
    }

    
    public double getThue() {
        return 0.02;
    }

}
