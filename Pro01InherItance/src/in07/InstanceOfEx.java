package in07;

public class InstanceOfEx {
	static void print(Person p) {			// Person p = new Person(); 과 같음
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
		System.out.print("new Student() -> \t"); print(new Student());
		// Person p = new Student(); 와 같은 표현
		System.out.print("new Researcher() -> \t"); print(new Researcher());
		// Person p = new Researcher(); 과 같은 표현
		System.out.print("new Professor() -> \t"); print(new Professor());
		// Person p = new Professor(); 과 같은 표현
	}

}
