package timer;

public class Timer extends Thread {
	
	int sec = 0;

	@Override
	public void run() {
		while (true) {
			System.out.println(sec);
			sec++;
			try {
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
		}
	}

}
