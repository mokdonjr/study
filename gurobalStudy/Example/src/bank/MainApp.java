package bank;

import java.util.Date;

public class MainApp {
	
	public static void main(String[] args) {
		
		// ��� �ð�
		long promiseTime = new Date().getTime() + 2000;
		long promiseMoney = 10L;
		
		
		// �޴� ���
		Person park = new Person("������", 100);
		park.setPromiseTime(promiseTime);
		park.start();
		
		// ��������1
		Person lim = new Person("�Ӳ���", 100);
		lim.setPromiseTime(promiseTime);
		lim.setSendMoney(promiseMoney);
		lim.setTarget(park);
		lim.start();
		
		// ��������2
		Person hwang = new Person("Ȳ����", 100);
		hwang.setPromiseTime(promiseTime);
		hwang.setSendMoney(promiseMoney);
		hwang.setTarget(park);
		hwang.start();
	}
}
