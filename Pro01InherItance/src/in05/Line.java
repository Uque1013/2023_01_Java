package in05;

public class Line extends Shape{
	public int a = 1234;
	public double b = 876.543;
	
	public void draw() {	// draw 오버라이딩(재정의)
		System.out.println("Line");
	}
	
	public void linedraw() {
		System.out.println("linedraw()");
	}
}