package th01;

import javax.swing.JLabel;

public class TimerThread extends Thread{
	private JLabel timerLabel;
	public TimerThread(JLabel timeJLabel) {
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
