
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BallonTh extends Thread {

	JLabel label;
	int x, y;

	BallonTh(JLabel label) {

		this.label = label;

	}

	public void run() {
		
		while (true) {
			
			x = (int) label.getLocation().getX();
			y = (int) label.getLocation().getY();

			try {

				label.setLocation(x, y - 1);

				Thread.sleep(10);
				if(y<=-150) {
					return;
				}

			} catch (InterruptedException e) {
				return;
			}
		}
	}

}

class Balloon extends JPanel{

	
	ImageIcon imgIcon = new ImageIcon("images/balloon.jpg");
	Image orginImage = imgIcon.getImage();
	Image scaleImage = orginImage.getScaledInstance(100, 100, 
			java.awt.Image.SCALE_SMOOTH);
	ImageIcon img = new ImageIcon(scaleImage);
	
	Balloon() {
		
		System.out.println("Ç³¼±ÆÇ³ÚÃß°¡");
		setVisible(true);
		setLayout(null);
		setBackground(Color.WHITE);
		addMouseListener(new MyMouseListener());
		
	}


	class MyMouseListener implements MouseListener {
		JLabel label;
		BallonTh bth;

		@Override
		public void mousePressed(MouseEvent e) {
			
			label = new JLabel(img);
			
			label.setLocation(e.getX()-50, e.getY());
			label.setVisible(true);
			label.setSize(100,100);
			add(label);
			bth = new BallonTh(label);
			bth.start();

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}
}
