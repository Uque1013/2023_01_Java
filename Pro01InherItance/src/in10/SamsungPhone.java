package in10;

public class SamsungPhone implements PhoneInterface{
	@Override
	public void sendCall() {
		System.out.println("띠리리링");
		
	}
	
	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다.");
	}
	// 추가 메서드 작성(일반 메서드)
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다");
	}
	
}
