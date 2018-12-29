
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainPanel extends JPanel {

	BalloonBtn bbtn;
	CountBtn cbtn;

	MainPanel() {

		setBackground(new Color(255, 213, 200));
		setLayout(new CardLayout());
		
		bbtn = new BalloonBtn();
		cbtn = new CountBtn();

		add(bbtn);
		bbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				
			}
			
		});
		add(cbtn);

	}

}

class BalloonBtn extends JButton {

	BalloonBtn() {

		setBackground(new Color(147, 165, 204));
		//setFont(new Font());
		//new Color(20,63,153)
		setText("풍선 날리기 예제");
	}
}

class CountBtn extends JButton {

	CountBtn() {
		setBackground(new Color(147, 165, 204));
		setText("카운트 예제");
	}
}
