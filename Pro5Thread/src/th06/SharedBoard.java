package th06;

class SharedBoard {
	private int sum = 0; // 집계판의 합
	synchronized public void add() {
		// 특정 스레드가 점유중일 경우 다른 스레드는 접근 불가
		// 데이터를 여러 스레드가 공유할 경우에는 반드시 동기화(synchronized)
		int n = sum;
		// Thread.yield(); // 현재 실행 중인 스레드 양보
		n += 10; // 10 증가
		sum = n; // 증가한 값을 집계합에 기록
		System.out.println(Thread.currentThread().getName() + " : " + sum);
		// Thread.currentThread().getName()는 현재 실행중인 스레드 이름
	}
	public int getSum() { 
		return sum; 
	}
}
