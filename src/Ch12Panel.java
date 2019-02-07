import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


class Ch12Panel extends JPanel{
	
	BalloonBtn bbtn;
	CountBtn cbtn;
	
	Ch12Panel(){
		
		setLayout(new FlowLayout());
		add(new JLabel("Chapter12 연습문제"));
		
		bbtn = new BalloonBtn();
		cbtn = new CountBtn();
		
		add(bbtn);
		add(cbtn);
		
		bbtn.addActionListener(new ChBtnAction());
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
	
	class ChBtnAction implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			JButton b = (JButton)e.getSource();
			
			CardLayout card = (CardLayout) getParent().getLayout();
			
			if(b.getText().equals("풍선 날리기 예제")) {
				
				
				
				card.show(getParent(),"balloon");
				
			}else if(b.getText().equals("카운트 예제")){
				
				
				//card.show(getParent(),"count");
				
			}else {
				System.exit(0);
			}
		}
		
	}
}
