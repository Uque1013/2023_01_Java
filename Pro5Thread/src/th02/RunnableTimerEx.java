package th02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RunnableTimerEx extends JFrame{
	public RunnableTimerEx() {
		setTitle("Thread를 상속 받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC, 80));
		c.add(timerLabel); // 컨테이너에 timerLabel을 더해준다.
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		// Thread th = new Thread(runnable);
		Thread th = new Thread(runnable);
		
		setSize(300, 170);
		setVisible(true);
		
		th.start(); // TimerRunnable클래스에 있는 run()메소드가 동작함.
	}
	
	public static void main(String[] args) {
		new RunnableTimerEx();
	}
}
