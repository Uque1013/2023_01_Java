package in01;

public class ColorPoint extends Point{		// Point 클래스 상속 받음
	private String color;	// 점 색상
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();		// Point 클래스의 showPoint() 호출
	}
	
}
