package th06;

public class SynchronizedEx {
	public static void main(String [] args) {
		SharedBoard board = new SharedBoard();
		Thread th1 = new StudentThread("kitae", board);
		Thread th2 = new StudentThread("gildong", board);
		th1.start();	// th1 스레드의 이름은 "kitae"
		th2.start();	// th2 스레드의 이름은 "gildong"
		// 2개의 스레드가 동작(실행)
	}
}

