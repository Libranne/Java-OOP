package tinhtonggiaodien;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class tinhtong extends Frame implements ActionListener{
	Label lb1,lb2,lb3;
	TextField txtX,txtY,txtKQ;
	Button btnTong,btnHieu,btnThuong,btnTich,btnThoat;
	
	public tinhtong()
	{
		lb1=new Label("x:");
		lb2=new Label("y:");
		lb3=new Label("KQ:");
		txtX=new TextField("4",25);
		txtY=new TextField("7",25);
		txtKQ=new TextField("",25);
		txtKQ.setEditable(false);
		btnTong=new Button("tong");
		btnHieu=new Button("hieu");
		btnTich=new Button("tich");
		btnThuong=new Button("thuong");
		btnThoat=new Button("thoat");
		// day la dieu khien giao dien
		setLayout(new FlowLayout());
		add(lb1);	add(txtX);
		add(lb2);	add(txtY);
		add(lb3);	add(txtKQ);
		add(btnTong); add(btnHieu); add(btnTich); add(btnThuong); add(btnThoat);
		//dang ky cac dieu khien voi bo xu ly su kien
		btnTong.addActionListener(this);
		btnHieu.addActionListener(this);
		btnTich.addActionListener(this);
		btnThuong.addActionListener(this);
		btnThoat.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		float xx,yy,kq;
		xx=Float.parseFloat(txtX.getText());
		yy=Float.parseFloat(txtY.getText());
		
		if(e.getSource()==btnTong)
		{
			kq=xx+yy;
			txtKQ.setText(String.valueOf(kq));
			
		}
		if(e.getSource()==btnHieu)
		{
			kq=xx-yy;
			txtKQ.setText(String.valueOf(kq));
			
		}
		if(e.getSource()==btnTich)
		{
			kq=xx*yy;
			txtKQ.setText(String.valueOf(kq));
			
		}
		if(e.getSource()==btnThuong)
		{
			if(yy==0)
				txtKQ.setText("chia cho 0");
			else
			{
				kq=xx/yy;
				txtKQ.setText(String.valueOf(kq));
			}
			
		}
		if(e.getSource()==btnThoat)
		{
			System.exit(0);
		}
		
	}
	public static void main (String[] args)
	{
		tinhtong t=new tinhtong();
		t.setVisible(true);
		t.setSize(250,200);
		t.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}
