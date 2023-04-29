package in02;

public class Person {
	private int weight;
	int age;		// 따로 접근 지정자 설정 안해주면 default가 기본
	protected int height;
	public String name;
	
	public void setWeight(int Weight) {
		this.weight = weight;	// 값을 저장함
	}
	public int getWeight() {
		return weight;			// 값을 리턴해줌
	}
}
