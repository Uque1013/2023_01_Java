package th03;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 깜박이는 레이블 생성
		FlickeringLabel fLabel = new FlickeringLabel("깜빡", 500);
		
		// 깜빡이지 않는 레이블 생성
		JLabel label = new JLabel("안깜빡");
		
		//깜빡이는 레이블 생성
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜빡", 300);
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlickeringLabelEx();	
		// 익명의 객체가 생성되고 생성자 호출 
	}

}
