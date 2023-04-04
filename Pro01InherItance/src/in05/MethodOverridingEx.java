package in05;

public class MethodOverridingEx {
//	static void paint(Shape p) {
//		p.draw(); // paint(line);에서 호출되었을 때 draw()메소드는 Line 클래스에 있는 메소드
//	}
	
	public static void main(String[] args) {
		Line line = new Line();
		Shape p = line; // p는 Shape 클래스를 가르키는 객체변수인데 line객체를 할당 받아서 업캐스팅
		System.out.println(p.a);
		System.out.println(p.b);
		p.shapedraw(); 
		p.draw();
		// p는 Shape 클래스의 모든 멤버에 접근할 수 있는데, 오버라이딩(재정의) 된 메소드는
		// 하위클래스의 메소드를 호출한다.
		
		//paint(line); //paint(Shape p) 메소드를 호출하는데 Shape p = line 문장과 같다.
//		paint(new Shape());
//		paint(new Line());
//		paint(new Rect());
//		paint(new Circle());
	}

}