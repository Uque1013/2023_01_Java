package th06;

class StudentThread extends Thread {
	private SharedBoard board; // 집계판의 주소
	
	public StudentThread(String name, SharedBoard board) {
		super(name); // 부모클래스의 생성자 호출을 통해서 
		this.board = board;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			board.add();
		}		
	}
}
