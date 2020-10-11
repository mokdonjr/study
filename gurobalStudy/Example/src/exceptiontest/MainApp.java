package exceptiontest;

public class MainApp {
	
	public static void main(String[] args) {
		System.out.println("프로그램이 시작되었습니다.");
		try {ArithmeticException e;
			play();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램이 모두 수행되었습니다.");
	}
	
	private static void play() throws Exception {
		
		// 마린과 파이어벳 전투 준비!
		Marine marine = new Marine(20);
		Firebat firebat = new Firebat(0);
		
		// 예외 체크
		if (marine.getHp() <= 0 || firebat.getHp() <= 0)
			throw new Exception("HP 값이 전투에 적합하지 않습니다");

		// 전투 수행!
		marine.damage(firebat);
	}
}





