package bai17;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Khachhang extends Frame implements ActionListener{
	
	Label lb1,lb2,lb3;
	TextField txtMa,txtTen,txtKieu;
	Button btnVe,btnThoat;
	int rr,bb,gg,yy;
	public Khachhang()
	{
		lb1=new Label("Ma khach hang:");
		lb2=new Label("Ten khach hang:");
		lb3=new Label("Kieu khach hang:");
		txtMa=new TextField("",25);
		txtTen=new TextField("",25);
		txtKieu=new TextField("",25);
		
		
		btnThoat=new Button("thoat");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
