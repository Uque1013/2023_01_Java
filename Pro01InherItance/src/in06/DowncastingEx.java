package in06;

public class DowncastingEx {

	public static void main(String[] args) {
		Person p = new Student("이재문");
		// p는 Person클래스를 가르키는 객체 변술이지만, Student객체를 할당받아
		//upcasting이 발생함
		
		Student s;
		// s는 Student클래스를 가르키는 객체 변수로 선언(기억공간은 할당 받지 못함)
		
		s =(Student)p;
		// s는 업캐스팅된 p객체변수를 가지고 Student클래스로 다운캐스팅하면
		// Student클래스의 객체를 할당 받는 것과 같다.
		// 따라서 Student s = new Student()이 문장과 같은 효과를 가진다.
		// 다운캐스팅은 반드시 업캐스팅 된 객체 변수를 가지고 해야 한다.
		
		
		System.out.println(s.name);
		s.grade = "A";
		s.name = "B";

	}

}