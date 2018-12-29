import java.awt.*;		// 배치관리자
import javax.swing.*;	// JFrame


public class JavaPx extends JFrame{

	Container c;
	
	JPanel northPanel,southPanel;
	JLabel northlabel,southlabel;
	
	

	
	public JavaPx() {
		
		setTitle("명품 자바 연습문제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//#ACDE2B	172,222,43
		//#FFC425	255,196,37
		//#EAF2DE	234,242,222	센터색
			// Color centerColor = new Color(234,242,222);
		//#DBDE83	219,222,131
		//#4A5E33	74,94,51	이걸 탑색으로
		Color topColor = new Color(97,114,71);
		Color textColor = new Color(255,255,255);
		
		c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		northPanel=new JPanel();
		northPanel.setLayout(new BorderLayout());
		
		northlabel = new JLabel();
		northlabel.setOpaque(false);
		northlabel.setBorder(BorderFactory.createEmptyBorder(10, 5, 5, 10));
		northlabel.setForeground(new Color(255,255,255));
		northlabel.setFont(new Font("맑은 고딕",Font.BOLD,15));
		northlabel.setText("명품자바 연습문제 모음입니다.");
		
		northPanel.add(northlabel,BorderLayout.WEST);
		northPanel.setBackground(topColor);
		c.add(northPanel,BorderLayout.NORTH);
		
		
		
		southPanel=new JPanel();
		southPanel.setLayout(new BorderLayout());
		
		southlabel = new JLabel();
		southlabel.setOpaque(false);
		southlabel.setBorder(BorderFactory.createEmptyBorder(10, 5, 5, 10));
		southlabel.setForeground(new Color(255,255,255));
		southlabel.setFont(new Font("맑은 고딕",Font.BOLD,12));
		southlabel.setText(" Copyright(c) 2019. NJH. All rights reserved.");
		
		southPanel.add(southlabel,BorderLayout.WEST);
		southPanel.setBackground(topColor);
		c.add(southPanel,BorderLayout.SOUTH);
	
		
		
		c.add(new MainPanel(),BorderLayout.CENTER);
		
		
		

		setVisible(true);
		setSize(600,600);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JavaPx();
	}

}
