package in02;

public class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길순";
		height = 175;
		//weight = 99; weight가 private으로 설정되었기 때문에 접근불가
		setWeight(99);
	}
}