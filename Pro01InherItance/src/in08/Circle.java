package in08;

public class Circle extends Shape{
	protected String name;
	
	@Override
	public void draw() {
		name = "Circle";
		super.name = "Shape";
		super.draw(); // Shape 클래스 name으로 실행
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Shape b = new Circle();
		b.paint(); // Shape 클래스에 paint 실행
	}

}