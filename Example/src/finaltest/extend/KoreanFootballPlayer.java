package finaltest.extend;

public class KoreanFootballPlayer extends FootballPlayer {
	
	public KoreanFootballPlayer() {
//		System.out.println("init KoreanFootballPlayer");
	}
	public KoreanFootballPlayer(String name) {
		super(name);
//		System.out.println("init KoreanFootballPlayer");
	}
	
	public int getMilitaryServiceMonths() {
		return 21;
	}

}
