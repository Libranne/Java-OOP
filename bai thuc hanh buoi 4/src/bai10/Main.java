package bai10;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong tu lanh: ");
        int n = sc.nextInt();
        ArrayList<TuLanh> list = new ArrayList<TuLanh>();
        for (int i = 0; i < n; i++) {
            TuLanh a = new TuLanh();
            a.nhap();
            list.add(a);
        }
        double TongTien = 0;
        System.out.print("\nDanh sach tu lanhn\n");
        for (TuLanh a : list) {
            System.out.println(a.toString());
            TongTien += a.ThanhTien();
        }
        System.out.print("\nTong tien tu lanh trong DS: " + TongTien);
        String k = "";
        System.out.print("\nNhap HangSX can tim DS:");
        k = sc.nextLine();
        System.out.print("\nDS Tu Lanh Co Hang " + k + " la: \n");
        for (TuLanh i : list) {
            if (i.getHangSX() == k) {
                System.out.println(i.toString());
            }
        }
        System.out.print("\nDS Tu lanh co dung tich tren 200lit\n");
        for (TuLanh i : list) {
            if (i.getDungTich() > 200) {
                System.out.println(i.toString());
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(list.get(j).getSoLuong()>list.get(i).getSoLuong()){
                    TuLanh b;
                    b=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,b);
                }
            }
        }
        System.out.print("\nDanh sach tu lanh theo thu tu giam dan cua so luong\n");
        for(TuLanh i:list){
            System.out.println(i.toString());
        }
    }

}
