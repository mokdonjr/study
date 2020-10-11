package timer2;

public class MainApp {
	
	public static void main(String[] args) {
		System.out.println("main 스레드가 시작됩니다.");
		
		Timer timer = new Timer();
		timer.start();
		
		System.out.println("main 스레드가 종료되었습니다.");
	}

}
