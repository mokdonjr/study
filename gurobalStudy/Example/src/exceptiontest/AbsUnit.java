package exceptiontest;

public abstract class AbsUnit implements Unit {
	
	private long attack = 1;
	private long hp = 100;
	private long hpMax = 100;
	
	public AbsUnit(long hp) {
		super();
		this.hp = hp;
	}

	@Override
	public void damage(Unit target) {
		long beforeHp = target.getHp();
		long afterHp = target.getHp() - getAttack();
		target.setHp(afterHp);
		System.out.println("АјАн!! hp:" + beforeHp + " -> " + afterHp);
	}

	public long getAttack() {
		return attack;
	}
	public void setAttack(long attack) {
		this.attack = attack;
	}
	public long getHp() {
		return hp;
	}
	public void setHp(long hp) {
		this.hp = hp;
	}
	public long getHpMax() {
		return hpMax;
	}
	public void setHpMax(long hpMax) {
		this.hpMax = hpMax;
	}
}
