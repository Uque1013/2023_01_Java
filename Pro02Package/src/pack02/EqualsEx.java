package pack02;

public class EqualsEx {

	public static void main(String[] args) {
		Point a = new Point(2, 3); // a객체 생성
		Point b = new Point(2, 3); // b객체 생성
		Point c = new Point(3, 4); // c객체 생성

		if (a == b) // a객체와 b객체, c객체는 각각의 다른 객체의 주소값을 가지고 있다.
			System.out.println("a == b"); // false출력 a와 b는 각각 다른 주소
		if (a.equals(b)) // a의 클래스의 내용과 b클래스의 내용을 비교
			System.out.println("a is equal to b"); // true출력
		if (a.equals(c))
			System.out.println("a is equal to c");
		// equals메소드는 Object에 있는 것이 아니고, Point 클래스에 있는 것을 호출
	}

}