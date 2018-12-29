import java.awt.*;		// 배치관리자
import javax.swing.*;	// JFrame


public class JavaPx extends JFrame{

	Container c;
	
	public JavaPx() {
		
		setTitle("명품 자바 연습문제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new MainPanel(),BorderLayout.CENTER);
		
		

		setVisible(true);
		setSize(600,600);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JavaPx();
	}

}
