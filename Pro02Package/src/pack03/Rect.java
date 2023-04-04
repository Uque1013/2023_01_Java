package pack03;

public class Rect {
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) {		// Object obj = b와 같다.
		Rect p = (Rect)obj;					// p는 b 객체를 저장한것과 같다.
		if(this.width*this.height == p.width*p.height)
			// a.equals(b)를 호출할 때 this.width, this. height는 a객체의 멤버
			// b.equals(c)를 호출할 때 this.width, this. height는 b객체의 멤버
			return true;
		else return false;
	}
}
