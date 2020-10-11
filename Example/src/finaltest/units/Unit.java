package finaltest.units;

public interface Unit {
	
	public void damage(Unit target);
	
	public long getAttack();
	public void setAttack(long attack);
	public long getHp();
	public void setHp(long hp);

}
