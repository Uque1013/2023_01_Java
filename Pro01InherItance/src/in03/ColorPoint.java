package in03;

public class ColorPoint extends  Point{
	private String color;	// 점의 색상
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);		// super()은 무조건 하나만
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();		// Point의 showPoint() 호출
	}
}
