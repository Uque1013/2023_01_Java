package in03;

public class ColorPoint extends Point {
	private String color; // 점의 색
	
	public ColorPoint(int x, int y, String color) {
		super(x,y); // x=5, y=6
		// super(); super()는 무조건 하나면 올 수 있음
		this.color = color; //멤버변수에 color값을 저장
		// super()는 무조건 맨 위, 첫 번째 라인에 위치 
	}

	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
}
