
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

class MenuPanel extends JPanel {

	ChBtn ch12btn, ch13btn;
	JPanel textPanel;JLabel textlbl;
	
	JPanel btnPanel;
	
	ImageIcon imgIcon = new ImageIcon("images/book.jpg");
	Image orginImage = imgIcon.getImage();
	Image scaleImage = orginImage.getScaledInstance(250, 300, 
			java.awt.Image.SCALE_SMOOTH);
	ImageIcon img = new ImageIcon(scaleImage);
	
	Color menuColor = new Color(185,191,175);
	Color centerColor = new Color(234,242,222);
	
	ChBtnAction btnAction;
	
	MenuPanel() {
		
		
		GridLayout grid1 = new GridLayout(1,2,10,10);
		setLayout(grid1);
		setBackground(centerColor);
		
		textPanel = new JPanel();
		textPanel.setBackground(centerColor);
		textPanel.setLayout(new BorderLayout());
		
		textlbl = new JLabel(" ");
		textlbl.setAlignmentX(Label.CENTER);
		
		JPanel bookPanel = new JPanel();
		bookPanel.setBackground(centerColor);
		bookPanel.setLayout(new FlowLayout());
		
		textPanel.add(textlbl,BorderLayout.NORTH);

		
		textPanel.add(bookPanel,BorderLayout.CENTER);
		
		JLabel bookLabel = new JLabel(img);
		bookPanel.add(bookLabel);
		
		
		
		GridLayout grid2 = new GridLayout(6,1,10,10);
		btnPanel = new JPanel();
		btnPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		//btnPanel.setBorder(new TitledBorder(new LineBorder(Color.WHITE,5)));
		btnPanel.setBackground(centerColor);
		btnPanel.setLayout(new GridLayout(1,1));
		
		JPanel btnPanel2 = new JPanel();
		btnPanel2.setLayout(grid2);
		btnPanel2.setBackground(menuColor);
		//btnPanel2.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		btnPanel2.setBorder(new TitledBorder(new LineBorder(new Color(111,114,105),3)));

		JPanel b12pnl = new JPanel();
		b12pnl.setBackground(menuColor);
		JPanel b13pnl = new JPanel();
		b13pnl.setBackground(menuColor);
		
		ch12btn = new ChBtn("12장 연습문제");
		ch13btn = new ChBtn("13장 연습문제");

		
		b12pnl.add(ch12btn);
		b12pnl.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 20));
		b13pnl.add(ch13btn);
		b13pnl.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 20));
		
		btnPanel2.add(b12pnl);
		btnPanel2.add(b13pnl);
		
		btnPanel.add(btnPanel2);
		
		add(textPanel);
		add(btnPanel);
		
		btnAction = new ChBtnAction();
		ch12btn.addActionListener(btnAction);
		ch13btn.addActionListener(btnAction);
				
		
	}
	
	class ChBtn extends JButton {

		ChBtn(String text) {

			setBackground(centerColor);
			setFont(new Font("맑은 고딕",Font.BOLD,12));
			setForeground(new Color(111,114,105));
			setContentAreaFilled(false);
			setText(text);
			
		}
		@Override
		protected void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D)g.create();
			g2.setPaint(new GradientPaint(
					new Point(0,0),
					getBackground(),
					new Point(0,getHeight()/3),
					new Color(255,255,255)));
			g2.fillRect(0, 0, getWidth(), getHeight()/3);
			g2.setPaint(new GradientPaint(
					new Point(0,getHeight()/3),
					new Color(255,255,255),
					new Point(0,getHeight()),
					getBackground()));
			g2.fillRect(0, getHeight()/3, getWidth(), getHeight());
			g2.dispose();
			
			super.paintComponent(g);
		}
	}
	class ChBtnAction implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			ChBtn b = (ChBtn)e.getSource();
			
			CardLayout card = (CardLayout) getParent().getLayout();
			
			if(b.getText().equals("12장 연습문제")) {
				
				
				
				card.show(getParent(),"ch12");
				
			}else if(b.getText().equals("13장 연습문제")){
				
				
				card.show(getParent(),"ch13");
				
			}else {
				System.exit(0);
			}
		}
		
	}
	

}
