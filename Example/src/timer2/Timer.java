package timer2;

public class Timer implements Runnable {
	
	int sec = 0;

	@Override
	public void run() {
		while (true) {
			System.out.println(sec);
			sec++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
		}
	}
}
