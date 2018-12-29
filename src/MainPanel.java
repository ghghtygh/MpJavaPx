
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainPanel extends JPanel {

	CardLayout card;
	MenuPanel menuPanel;
	Ch12Panel ch12Panel;
	Ch13Panel ch13Panel;
	MainPanel() {
		
		Color menuColor = new Color(234,242,222);
		card = new CardLayout();
		setBackground(menuColor);
		setLayout(card);
		
		menuPanel = new MenuPanel();
		ch12Panel = new Ch12Panel();
		ch13Panel = new Ch13Panel();
		
		add(menuPanel,"1");
		add(ch12Panel,"12");
		add(ch13Panel,"13");
		
		
	}

}

