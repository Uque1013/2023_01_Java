package in01;

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); // Point 객체 생성
		//p.x = 5; -- private으로 설정되어서 접근불가
		p.set(1, 2); // Point클래스의 멤버변수에 1,2가 저장
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); // Point클래스의 멤버변수에 3,4가 저장
		cp.setColor("red");
		cp.showColorPoint();
	}
}
