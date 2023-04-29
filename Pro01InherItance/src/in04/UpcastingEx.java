package in04;

public class UpcastingEx {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("이재문");
		p = s;
		// p는 person 클래스를 가르키는 객체변수이고,
		// s는 하위클래스(Student)를 가르키는 객체로
		// p는 s객체를 할당 받음
		
		// Person p = new Student(); ---- Upcasting이 된다.
		System.out.println(p.name);	// 오류 안남
		
		//p.grade = "A";			컴파일 오류
		//p.department = "Com";		컴파일 오류
	}
}