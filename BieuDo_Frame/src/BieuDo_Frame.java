import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BieuDo_Frame extends Frame implements ActionListener{
	//khai bao thanh phan giao dien
	Label lb1,lb2,lb3,lb4;
	TextField txtRed,txtBlue,txtGreen,txtYellow;
	Button btnVe,btnThoat;
	int rr,bb,gg,yy;
	public BieuDo_Frame()
	{
		//khoi tao thanh phan giao dien
		lb1= new Label("Red:");
		lb2= new Label("Blue:");
		lb3= new Label("Green:");
		lb4=new Label("Yellow:");
		txtRed=new TextField("70",5);
		txtBlue=new TextField("50",5);
		txtGreen=new TextField("100",5);
		txtYellow=new TextField("80",5);
		btnVe=new Button("Draw");
		btnThoat=new Button("Exit");
		// dang ky voi bo lang nghe de xu ly
		btnVe.addActionListener(this);
		btnThoat.addActionListener(this);
		// dua cac doi tuong hien thi len applet
		setLayout(new FlowLayout());
		add(lb1);  add(txtRed);
		add(lb2);  add(txtBlue);
		add(lb3);  add(txtGreen);
		add(lb4);  add(txtYellow);
		add(btnVe);  add(btnThoat);
		// lay gia tri de ve bieu do
		rr=Integer.parseInt(txtRed.getText());
		bb=Integer.parseInt(txtBlue.getText());
		gg=Integer.parseInt(txtGreen.getText());
		yy=Integer.parseInt(txtYellow.getText());
	}	// end of ham khoi tao
	public void paint(Graphics g)
	{
		g.drawLine(50, 50, 50, 250);
		g.drawLine(50, 250, 350, 250);
		
		g.setColor(Color.red);
		g.fillRect(70,250-rr,30,rr);
		g.drawString(String.valueOf(rr), 70, 250-rr);
		
		g.setColor(Color.blue);
		g.fillRect(130,250-bb,30,bb);
		g.drawString(String.valueOf(bb), 130, 250-bb);
		
		g.setColor(Color.green);
		g.fillRect(190,250-gg,30,gg);
		g.drawString(String.valueOf(gg), 190, 250-gg);
		
		g.setColor(Color.yellow);
		g.fillRect(250,250-yy,30,yy);
		g.drawString(String.valueOf(yy), 250, 250-yy);
	} //end of paint
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		rr=Integer.parseInt(txtRed.getText());
		bb=Integer.parseInt(txtBlue.getText());
		gg=Integer.parseInt(txtGreen.getText());
		yy=Integer.parseInt(txtYellow.getText());
		
		if(e.getSource()==btnVe)
		{
			repaint();
			// goi lai ham paint voi gia tri moi
		}
		
		if(e.getSource()==btnThoat)
		{
			System.exit(0);
		}
		
	}
	public static void main(String[] args) {
        BieuDo_Frame t = new BieuDo_Frame();
        t.setVisible(true);
        t.setSize(500, 300);
        t.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        );
    }

}
