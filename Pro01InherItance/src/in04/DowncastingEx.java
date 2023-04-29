package in04;

public class DowncastingEx {

	public static void main(String[] args) {
		Person p = new Student("이재문");	// 업캐스팅
		Student s;
		
		s = (Student)p;						// 다운캐스팅 (타입 명시 필요)
		
		System.out.println(s.name);			// 오류 안남
		s.grade = "A";						// 오류 안남

	}

}
