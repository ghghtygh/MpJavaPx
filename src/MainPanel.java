
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainPanel extends JPanel {

	CardLayout card;
	MenuPanel menuPanel;
	Ch12Panel ch12Panel;
		BalloonPanel balloonPanel;
		//CountPanel countPanel;
	Ch13Panel ch13Panel;
	MainPanel() {
		
		Color menuColor = new Color(234,242,222);
		card = new CardLayout();
		setBackground(menuColor);
		setLayout(card);
		
		menuPanel = new MenuPanel();
		ch12Panel = new Ch12Panel();
		ch13Panel = new Ch13Panel();
		balloonPanel = new BalloonPanel();
		//countPanel = new CountPanel();
		
		add(menuPanel,"menu");
		add(ch12Panel,"ch12");
			add(balloonPanel,"balloon");
			//add(countPanel,"count");
		
			
			add(ch13Panel,"ch13");
		
		
	}

}

