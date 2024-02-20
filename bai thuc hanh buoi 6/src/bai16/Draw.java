package bai16;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Draw  extends Frame implements ActionListener {
	Label lb1,lb2,lb3,lb4;
	TextField red;
	TextField blue,green,yellow;
	Button btnDraw,btnThoat;
	public Draw()
	{
		lb1=new Label("red:");
		lb2=new Label("blue:");
		lb3=new Label("green:");
		lb4=new Label("yellow:");
		red=new TextField("",15);
		blue=new TextField("",15);
		green=new TextField("",15);
		yellow= new TextField("",15);
		
		btnDraw=new Button("Draw");
		
		btnThoat=new Button("thoat");
		
		setLayout(new FlowLayout());
		add(lb1);	add(red);
		add(lb2);	add(blue);
		add(lb3);	add(green);
		add(lb4);	add(yellow);
		add(btnDraw);  add(btnThoat);
		
		btnDraw.addActionListener(this);
		
		btnThoat.addActionListener(this);
	}
	public void paint(Graphics g) {
    	drawLine(300, 300, 20, 10);
        setBackground(Color.white);
        g.fillRect(150, 300, 70, 70);
        
        setForeground(Color.green);
        g.fillRect(300, 300, 70, 50);
        //setForeground(Color.blue);
        
       g.fillRect(450, 300, 70, 100);
       g.fillRect(600, 300, 70, 80);
        
        
 
    }
	private void drawLine(int i, int j, int k, int l) {
		// TODO Auto-generated method stub

	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		if(e.getSource()==btnThoat)
		{
			System.exit(0);
		}
		
	}
	

}
