package in02;

public class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		// weight = 99;	오류 발생. 슈퍼 클래스의 private 접근 불가 
		setWeight(99);	// private 멤버 weight는 setWeight()으로 간접 접근 가능
	}
}
