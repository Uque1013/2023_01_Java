package in08;

public class Shape {
	protected String name;
	public void paint() {
		draw();
	}
	
	public void draw() {
		System.out.println(name);
	}
}
