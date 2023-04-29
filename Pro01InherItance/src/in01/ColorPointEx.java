package in01;

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		//p.x = 5; -- private으로 설정되어서 접근불가
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);		// Point의 set() 호출
		cp.setColor("red");	// Color의 setColor() 호출
		cp.showColorPoint();// 색상 및 좌표 출력
	}

}
