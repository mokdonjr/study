package singletontest;

public class Counter {
	
	private static Counter instance;
	private long value = 0L;
	
	private Counter() {
		
	}
	
	public static Counter getInstance() {
		if (instance == null)
			instance = new Counter();
		return instance;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	
	public long addValue(long value) {
		this.value += value;
		return this.value;
	}
}
