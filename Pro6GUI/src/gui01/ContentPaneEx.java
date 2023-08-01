package gui01;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		// setTitle("ContentPane과 JFrame");
		super("ContentPane과 JFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 윈도우 창을 닫을 때 응용프로그램(모든 스레드)가 종료 된다
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		// JButton ok = new JButton("OK");
		contentPane.add(new JButton("OK"));
		// 'ok' 버튼을 만들어서 컨테이너 위에 더해준다
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
