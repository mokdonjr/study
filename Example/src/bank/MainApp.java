package bank;

import java.util.Date;

public class MainApp {
	
	public static void main(String[] args) {
		
		// 약속 시간
		long promiseTime = new Date().getTime() + 2000;
		long promiseMoney = 10L;
		
		
		// 받는 사람
		Person park = new Person("박지성", 100);
		park.setPromiseTime(promiseTime);
		park.start();
		
		// 보내는자1
		Person lim = new Person("임꺽정", 100);
		lim.setPromiseTime(promiseTime);
		lim.setSendMoney(promiseMoney);
		lim.setTarget(park);
		lim.start();
		
		// 보내는자2
		Person hwang = new Person("황진이", 100);
		hwang.setPromiseTime(promiseTime);
		hwang.setSendMoney(promiseMoney);
		hwang.setTarget(park);
		hwang.start();
	}
}
