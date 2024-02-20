package bai18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class DSNV {
	ArrayList<Connguoi> listPS;

    public void nhap() {
        int line, soNS;
        Scanner sc = new Scanner(System.in);
        listPS = new ArrayList<Connguoi>();
        Connguoi ps = null;
        System.out.print("Nhap so luong nhan su: ");
        soNS = sc.nextInt();
        for (int i = 0; i < soNS; i++) {
            System.out.println("Nhap thong tin nhan su thu: " + (i + 1) + ":");
            do {
                System.out.print("Chon nhan su(1 - cong nhan, 2 - ki su, 3- dien vien): ");
                line = sc.nextInt();
                switch (line) {
                    case 1:
                        ps = new Congnhan();
                        ps.nhap();
                        listPS.add(ps);
                        break;
                    case 2:
                        ps = new Kysu();
                        ps.nhap();
                        listPS.add(ps);
                        break;
                    case 3:
                        ps = new Dienvien();
                        ps.nhap();
                        listPS.add(ps);
                        break;
                    default:
                        System.out.println("Chon khong hop le.");
                        break;
                }
            } while (line < 1 || line > 4);
        }

    }

    public void hien() {
        System.out.println("Hien DSNS: ");
        for (Connguoi a : listPS) {
            System.out.println(a.toString());
        }
    }
    public void tinhtongThuong()
    {
        float tongT = 0;
        for (Connguoi kt : listPS) 
        {
            tongT += kt.tienThuong();
        }
        System.out.println("Tong tien thuong phai tri cho DSNS: " + tongT);
    }
	
	
	/*public void luongMax()
	{
		float  luong=Integer.MIN_VALUE;
		for(Congnguoi pr: lstNV);
		if(pr instanceof Dienvien)
		{
			if(((Dienvien)pr).tinhluong()>luong)
			{
				luong = ((Dienvein)pr).tinhluong();
			}
		}
		
	}*/
	 public void luuFile() throws FileNotFoundException, IOException {
	        File f = new File("dsns.dat");

	        FileOutputStream fout = new FileOutputStream(f);
	        ObjectOutputStream objout = new ObjectOutputStream(fout);

	        objout.writeObject(listPS);

	        objout.close();
	        fout.close();
	    }

	    public void docFile() throws FileNotFoundException, IOException, ClassNotFoundException {
	        File f = new File("dsns.dat");

	        FileInputStream fin = new FileInputStream(f);
	        ObjectInputStream objin = new ObjectInputStream(fin);

	        listPS = new ArrayList<Connguoi>();
	        listPS = (ArrayList) objin.readObject();

	        objin.close();
	        fin.close();

	    }

}
