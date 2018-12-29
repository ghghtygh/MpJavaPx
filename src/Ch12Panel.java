import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Ch12Panel extends JPanel{
	
	BalloonBtn bbtn;
	CountBtn cbtn;
	
	Ch12Panel(){
		
		setLayout(new FlowLayout());
		add(new JLabel("Chapter12 ��������"));
		
		bbtn = new BalloonBtn();
		cbtn = new CountBtn();
		
		add(bbtn);
		add(cbtn);
	}
	
	class BalloonBtn extends JButton {

		BalloonBtn() {

			setBackground(new Color(147, 165, 204));
			//setFont(new Font());
			//new Color(20,63,153)
			setText("ǳ�� ������ ����");
		}
	}

	class CountBtn extends JButton {

		CountBtn() {
			setBackground(new Color(147, 165, 204));
			setText("ī��Ʈ ����");
		}
	}
}
