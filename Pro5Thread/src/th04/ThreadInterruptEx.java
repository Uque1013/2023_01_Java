package th04;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ThreadInterruptEx extends JFrame {
	private Thread th;
		public ThreadInterruptEx() {
			setTitle(" hreadInterruptEx 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			JLabel timerLabel = new JLabel();
			timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
			TimerRunnable runnable = new TimerRunnable(timerLabel);
			th = new Thread(runnable); // 스레드 생성
			c.add(timerLabel);
			// 버튼을 생성하고 Action 리스너 등록
			JButton btn =new JButton("kill Timer");
			btn.addActionListener((ActionListener) new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					th.interrupt(); // 타이머 스레드 강제 종료
					JButton btn = (JButton)e.getSource();
					btn.setEnabled(false); // 버튼 비활성화
				}
			});
			c.add(btn);
			setSize(300,170);
			setVisible(true);
			th.start(); // 스레드 동작시킴
		}
		public static void main(String[] args) {
			new ThreadInterruptEx();
		}
}