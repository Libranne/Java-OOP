package bai12;
import java.util.ArrayList;
import java.util.Scanner;

public class HocsinhTest {
	public static void main(String[] args) {
        int chon=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Nguoi> hs = new ArrayList<Nguoi>();
        System.out.print("Nhap so luong hoc sinh: ");
        int n = sc.nextInt();
        do
        {
            System.out.println("\n---MENULIST---");
            System.out.println("1. Nhap vao N hoc sinh cua cac lop khac nhau");
            System.out.println("2. Sap xep danh sach hoc sinh theo ten lop va hien ra man hinh");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Moi ban chon: ");
            chon= sc.nextInt();
            switch(chon)
            {
                case 1:
                {
                    for(int i=0; i<n; i++)
                    {
                        System.out.println("---Nhap thong tin hoc sinh thu "+(i+1));
                        Hocsinh a = new Hocsinh();
                        a.nhap();
                        hs.add(a);
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("--DANH SACH HOC SINH THEO TEN LOP--");
                    for(int i=0; i<hs.size()-1; i++)
                    {
                        for(int j=i+1; j<hs.size(); j++)
                        {
                            if(hs.get(i).getTenLop().compareTo(hs.get(j).getTenLop())>0)
                            {
                                Nguoi tmp = hs.get(i);
                                hs.set(i, hs.get(j));
                                hs.set(j, tmp);
                            }
                        }
                    }
                    for(Nguoi i: hs)
                    {
                        i.xuat();
                        System.out.println();
                    }
                    break;
                }
                case 0:
                {
                    System.exit(0);
                    break;
                }
               
            }   
        }while(chon!=0);
    }

}
