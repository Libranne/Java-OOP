import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        DSKhenThuong dskt = new DSKhenThuong();
        int chon;
        do {
            System.out.print("\n 1. Nhap DS");
            System.out.print("\n 2. Hien DS");
            System.out.print("\n 3. GhiFile");
            System.out.print("\n 4. DocFile");
            System.out.print("\n 6. Hien DSKT GV");
            System.out.print("\n 0. Thoat chuong trinh!");
            System.out.print("\n Moi ban chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    dskt.nhap();
                    break;
                case 2:
                    dskt.hien();
                    break;
                case 3:
                    dskt.luuFile();
                    break;
                case 4:
                    dskt.docFile();
                    dskt.hien();
                    break;   
                case 6:
                    dskt.hienGVKT();
                    break;
         
                
                default:
                    System.out.println("Cam on!");
            }
        } while (chon != 0);
    }
}

