package in12;

public class Radio implements Sound {
	private int SndLevel;
	public Radio() {
		SndLevel = 0;
	}
		
	@Override
	public void SoundUP(int level) {
		SndLevel += level;
		System.out.println("Radio볼륨"+level+"증가");
	}
	
	@Override
	public void SoundDown(int level) {
		SndLevel -= level;
		if(SndLevel < 0)
			SndLevel = 0;
		System.out.println("Radio볼륨"+level+"감소");
	}
}