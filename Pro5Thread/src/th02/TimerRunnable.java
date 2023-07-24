package th02;

import javax.swing.JLabel;

public class TimerRunnable implements Runnable {
	// Runnable 인터페이스를 가지고 클래스를 구현하는데 run()메소드는
	// 반드시 재정의를 해야함
	private JLabel timerLabel;
	public TimerRunnable(JLabel timeJLabel) {
		this.timerLabel = timeJLabel;
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n)); // 레이블에 숫자를 출력함.
			n++;
			try {
				Thread.sleep(1000);;	// 1000은 1초를 의미하고, 1초씩 지연함
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}
