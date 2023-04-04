package pack01;

public class ObjectPropertyEx {
	public static void print(Object obj) {	// Object obj = p --> 형변환
		// Object 클래스는 모든 클래스의 아버지 클래스이다.
		System.out.println(obj.getClass().getName());	// 클래스 이름
		System.out.println(obj.hashCode()); 			// 해시코드를 출력함. 클래스의 코드값
		System.out.println(obj.toString());				// obj객체를 문자열로 출력
		System.out.println(obj);						// 객체 출력
	}

	public static void main(String[] args) {
		Point p = new Point(2, 3);
//		print(p);
		System.out.println(p.toString());
		System.out.println(p);	//p는 자동으로 p.toString()으로 자동변환되어 호출
		System.out.println(p + "입니다.");
	}

}