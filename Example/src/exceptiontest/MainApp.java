package exceptiontest;

public class MainApp {
	
	public static void main(String[] args) {
		System.out.println("���α׷��� ���۵Ǿ����ϴ�.");
		try {ArithmeticException e;
			play();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("���α׷��� ��� ����Ǿ����ϴ�.");
	}
	
	private static void play() throws Exception {
		
		// ������ ���̾ ���� �غ�!
		Marine marine = new Marine(20);
		Firebat firebat = new Firebat(0);
		
		// ���� üũ
		if (marine.getHp() <= 0 || firebat.getHp() <= 0)
			throw new Exception("HP ���� ������ �������� �ʽ��ϴ�");

		// ���� ����!
		marine.damage(firebat);
	}
}





