package bank;

import java.util.Date;

public class Person extends Thread {
	
	private String personName;
	private long money;
	private Person target;
	private Long promiseTime;
	private Long sendMoney;
	
	public Person(String personName, long money) {
		super();
		this.personName = personName;
		this.money = money;
	}
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public long getMoney() {
		return money;
	}
	public synchronized void setMoney(long money) {
		this.money = money;
	}
	
	public void sendMoney(Person target, long money) {
		Date date = new Date();
		System.out.println(this.personName + " ´ÔÀÌ " + target.getPersonName() + " ´Ô¿¡°Ô " + money + " ¿ø ¼Û±Ý! " + date + "(" + date.getTime());
		target.setMoney(target.getMoney() + money);
		this.money -= money;
	}
	
	public Person getTarget() {
		return target;
	}
	public void setTarget(Person target) {
		this.target = target;
	}
	public Long getPromiseTime() {
		return promiseTime;
	}
	public void setPromiseTime(Long promiseTime) {
		this.promiseTime = promiseTime;
	}
	public Long getSendMoney() {
		return sendMoney;
	}
	public void setSendMoney(Long sendMoney) {
		this.sendMoney = sendMoney;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", money=" + money + "]";
	}

	@Override
	public void run() {
		boolean isSent = false;
		while (!isSent) {
			
			long currentTime = new Date().getTime();
//			System.out.println("QWER " + personName + " " + target + " " + sendMoney);
			if (target != null && sendMoney != null) {
				if (currentTime >= promiseTime) {
//					System.out.println("ASDF " + personName + " " + money);
					sendMoney(target, sendMoney);
					isSent = true;
				}
			}
			
			if (currentTime >= promiseTime + 1000) {
				System.out.println(toString());
				isSent = true;
			}
		}
		
	}
}
