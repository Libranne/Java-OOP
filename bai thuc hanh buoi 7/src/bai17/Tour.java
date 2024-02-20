package bai17;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Tour extends Frame implements ActionListener,ItemListener{
	Label lb1,lb2,lb3,lb4;
	TextField txtma,txtkieu,txtthongtin,txtdongia;
	Button btnThoat;
	private List kieu;
	
	public Tour()
	{
		lb1=new Label("ma tour:");
		lb2=new Label("kieu tour:");
		lb3=new Label("thong tin tour:");
		lb3=new Label("don gia:");
		kieu= new List();
		txtma=new TextField("",25);
		txtkieu=new TextField("",25);
		txtthongtin=new TextField("",25);
		txtdongia=new TextField("",25);
		
		btnThoat=new Button("thoat");
		
		setLayout(new FlowLayout());
		add(lb1);	add(txtma);
		add(lb2);	add(txtkieu);
		add(lb3);	add(txtthongtin);
		add(lb4);	add(txtdongia);
		 add(btnThoat);
	
		
		btnThoat.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
