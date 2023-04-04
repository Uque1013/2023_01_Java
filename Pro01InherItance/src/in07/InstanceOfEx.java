package in07;

public class InstanceOfEx {
	static void print(Person p) { // Person p = new Professor(); 와 같은 표현
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student() ->  "); print(new Professor());
		
		// System.out.print("new Student() ->  "); print(new Student());
		// Person p = new Student(); 와 같은 표현
		// System.out.print("new Student() ->  "); print(new Researcher());
		// Person p = new Researcher(); 와 같은 표현

	}

}