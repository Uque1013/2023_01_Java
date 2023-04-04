package in12;

public interface Sound { // 인터페이스는 태생 자체가 추상메소드만 작성
	public void SoundUP(int level); // 추상메소드
	public void SoundDown(int level);
//	public void SoundStop() { ----- 오류발생
//		System.out.println("중단");
//	}
}
