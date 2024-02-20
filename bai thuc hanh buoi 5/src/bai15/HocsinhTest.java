package bai15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class HocsinhTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
        int chon=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Nguoi> hs = new ArrayList<Nguoi>();
        System.out.print("Nhap so luong hoc sinh: ");
        int n = sc.nextInt();
        do
        {
            System.out.println("\n---MENULIST---");
            System.out.println("1. Nhap vao N hoc sinh ");
            System.out.println("2. Hien ds hoc sinh");
            System.out.println("3. hien hs nam sinh X");
            System.out.println("4. luu file");
            System.out.println("5. doc file");
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
                case 2:{
                	System.out.println("--DANH SACH HOC SINH ");
                	for(Nguoi i: hs)
                    {
                        i.xuat();
                        System.out.println();
                    }
                }
                /*case 3: private int namsinh;
                {
                	 System.out.print("Nhap Nam Sinh : ");
                     namsinh= sc.nextInt();
                    for(int i=0; i<hs.size()-1; i++)
                    {
                       
                        }
                    
                    for(Nguoi i: hs)
                    {
                        i.xuat();
                        System.out.println();
                    }
                    break;
                }*/
                case 4:{
                	 //luubdfile()
                	//throws FileNotFoundException, IOException 
                			 {
                				 File f = new File("dshocsinh.dat");
                				 FileOutputStream fout = new FileOutputStream(f);
                				 ObjectOutputStream out = new ObjectOutputStream(fout);
                				 
                				 out.writeObject(hs);
                				 
                				 out.close();
                				 fout.close();
                				 }
                
                }
                case 5:{
                	//public void docbdfile()
                			 //throws FileNotFoundException,IOException, ClassNotFoundException
                			 {
                				 File f= new File("dshocsinh.dat");
                				 
                				 FileInputStream fin = new FileInputStream(f);
                				 ObjectInputStream in = new ObjectInputStream(fin);
                				  hs = new ArrayList<Nguoi>();
                				  
                				  hs = (ArrayList)in.readObject();
                				  
                				  in.close();
                				  fin.close();
                			 }
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
