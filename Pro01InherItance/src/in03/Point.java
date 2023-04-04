package in03;

public class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표 
	
	public Point() { // 기본생성자
		this.x=0;
		this.y=0;
	}
	
	public Point(int x, int y) { // 정수형 매개변수 1개를 가지고 있는 생성자
		this.x=x;
		this.y=y;
	} // 멤버변수 x=5, y=6
	
	public void showPoint() { // 점의 좌표를 출력
		System.out.println("("+x+","+y+")");
	}
	
}
