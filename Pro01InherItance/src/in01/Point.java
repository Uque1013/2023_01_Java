package in01;

public class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표 
	
	public void set(int x, int y) { // x, y는 스택영역에 저장되며,
		// 메소드 실행이 종료되면 x, y변수는 사라짐
		this.x=x;
		this.y=y;
	}
	
	public void showPoint() { // 점의 좌표를 출력
		System.out.println("("+x+","+y+")");
	}
}
