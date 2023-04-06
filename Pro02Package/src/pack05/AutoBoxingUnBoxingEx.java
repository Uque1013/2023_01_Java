package pack05;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		int n = 10;				// 기본형 정수
		Integer intObject = n;	// intObject객체 변수에 n값을 저장하면 -- 자동 박싱
		System.out.println("intObject = "+intObject);
		
		int m = intObject + 10;	// 객체변수 + 기본형 정수 --> 기본형으로 저장됨 (왼쪽이 중요함 int m이 기본형이라 기본형으로 저장)
		System.out.println("m = "+m);

	}

}
