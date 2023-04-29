package in03;

public class Point {
	private int x, y;
	
	public Point() {		// 기본 생성자
		this.x = 0; this.y = 0;
	}
	public Point(int x, int y) {	// 매개변수 생성자
		this.x = x; this.y = y;
	}
	public void showPoint() {		// 점의 좌표 출력
		System.out.println("("+x+","+y+")");
	}
}
