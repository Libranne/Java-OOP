package bai17;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class main {
	public static void main(String[] args) {
		
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
