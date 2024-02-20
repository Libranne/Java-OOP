import java.util.ArrayList;
import java.util.Scanner;
import TienThuong.TienThuong;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class DSKhenThuong implements Serializable {

    ArrayList<Person> listPS;
    ArrayList<SinhVien> listSV = new ArrayList<>();

    public void nhap() {
        int line, soQD;
        String ngayKT, noidungKT, loaiKT;
        Scanner sc = new Scanner(System.in);
        listPS = new ArrayList<Person>();
        Person ps = null;
        System.out.print("Nhap so quyet dinh khen thuong: ");
        soQD = sc.nextInt();
        System.out.print("Ngay khen thuong: ");
        sc.nextLine();
        ngayKT = sc.nextLine();
        System.out.print("Noi dung khen thuong: ");
        noidungKT = sc.nextLine();
        System.out.print("Loai khen thuong: ");
        loaiKT = sc.nextLine();
        for (int i = 0; i < soQD; i++) {
            System.out.println("Nhap thong tin nguoi: " + (i + 1) + ":");
      
                        ps = new GVKhenThuong();
                        ps.nhap();
                        listPS.add(ps);
   
           
        }

    }
    public void hien() {
        System.out.println("Hien DS: ");
        for (Person a : listPS) {
            System.out.println(a.toString());
        }
    }

    public void hienGVKT() {
        System.out.println("HIEN DS GiANG VIEN KHEN THUONG: ");
        for (Person a : listPS) {
            if (a.getSoCTNC() >= 2) {
                System.out.println(a.toString());
            }
        }
    }


    /*public void Xoa() {
        Scanner sc = new Scanner(System.in);
        int k;
        int vitri=0;
        System.out.print("Nhap vi tri xoa: ");
        k = sc.nextInt();
        Object k1;
		listPS.remove(vitri -> vitri.equals(k1) );
    }*/


    public void luuFile() throws FileNotFoundException, IOException {
        File f = new File("baithi.dat");

        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream objout = new ObjectOutputStream(fout);

        objout.writeObject(listPS);

        objout.close();
        fout.close();
        System.out.println("luu thanh cong!");
    }

    public void docFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        File f = new File("baithi.dat");

        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);

        listPS = new ArrayList<Person>();
        listPS = (ArrayList<Person>) objin.readObject();
        objin.close();
        fin.close();
        

    }

}

