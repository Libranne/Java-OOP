package bai16;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main  extends Frame implements ActionListener{
	/*public static void main (String[] args)
	{
		Draw d=new Draw();
		d.setVisible(true);
		d.setSize(800,700);
		d.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}*/
	Label lb1, lb2, lb3, lb4;
    TextField txtRed, txtBlue, txtGreen, txtYellow;
    Button btnDraw;

    public Main() {
        lb1 = new Label("Red: ");
        lb2 = new Label("Blue: ");
        lb3 = new Label("Green: ");
        lb4 = new Label("Yellow: ");
        txtRed = new TextField("", 7);
        txtBlue = new TextField("", 7);
        txtGreen = new TextField("", 7);
        txtYellow = new TextField("", 7);
        btnDraw = new Button("Draw");
        setLayout(new FlowLayout());
        add(lb1); add(txtRed); add(lb2); add(txtBlue); add(lb3); add(txtGreen); add(lb4); add(txtYellow);
        add(btnDraw);
        btnDraw.addActionListener(this);
    }

    public void paint(Graphics bx) {
        int r, b, g, y;
        r = Integer.parseInt(txtRed.getText());
        b = Integer.parseInt(txtBlue.getText());
        g = Integer.parseInt(txtGreen.getText());
        y = Integer.parseInt(txtYellow.getText());

        //Vertical axis
        bx.drawLine(50, 80, 50, 350);
        //Horizontal axis
        bx.drawLine(50, 350, 450, 350);

        //Red col
        bx.setColor(Color.red);
        bx.drawString(txtRed.getText(), 138, 350 - r - 8);
        bx.fillRect(120, 350 - r, 50, r);

        //Blue col
        bx.setColor(Color.blue);
        bx.drawString(txtBlue.getText(), 218, 350 - b - 8);
        bx.fillRect(200, 350 - b, 50, b);

        //Green col
        bx.setColor(Color.green);
        bx.drawString(txtGreen.getText(), 295, 350 - g - 8);
        bx.fillRect(280, 350 - g, 50, g);

        //Yellow col
        bx.setColor(Color.yellow);
        bx.drawString(txtYellow.getText(), 378, 350 - y - 8);
        bx.fillRect(360, 350 - y, 50, y);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnDraw) {
            repaint();
        }
    }

    public static void main(String[] args) {
        Main t = new Main();
        t.setVisible(true);
        t.setSize(600, 400);
        t.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        );
    }

	

}
