package bai14;

import java.util.Scanner;

public class xe {
		private String tenXe;
		private String hangSx;
		private double giaTri;
		private String mauSac;

public xe() {
}

public xe(String tenXe, String hangSx, double giaTri, String mauSac) {
    this.tenXe = tenXe;
    this.hangSx = hangSx;
    this.giaTri = giaTri;
    this.mauSac = mauSac;
}

public String getTenXe() {
    return tenXe;
}

public void setTenXe(String tenXe) {
    this.tenXe = tenXe;
}

public String getHangSx() {
    return hangSx;
}

public void setHangSx(String hangSx) {
    this.hangSx = hangSx;
}

public double getGiaTri() {
    return giaTri;
}

public void setGiaTri(double giaTri) {
    this.giaTri = giaTri;
}

public String getMauSac() {
    return mauSac;
}

public void setMauSac(String mauSac) {
    this.mauSac = mauSac;
}


public String toString() {
    return "xe{" + "tenXe=" + tenXe + ", hangSx=" + hangSx + ", giaTri=" + giaTri + ", mauSac=" + mauSac + '}';
}



public void nhap() {
    System.out.println("nhap ten xe: ");
    tenXe = new Scanner(System.in).nextLine();
    System.out.println("nhap hang sx: ");
    hangSx= new Scanner(System.in).nextLine();
    System.out.println("nhap gia tri: ");
    giaTri = new Scanner(System.in).nextDouble();
    System.out.println("nhap mau sac: ");
    mauSac= new Scanner(System.in).nextLine();
}

public double tinhThue() {
	return 0;
}

}
