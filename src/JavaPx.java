import java.awt.*;		// ��ġ������
import javax.swing.*;	// JFrame


public class JavaPx extends JFrame{

	Container c;
	
	public JavaPx() {
		
		setTitle("��ǰ �ڹ� ��������");
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
