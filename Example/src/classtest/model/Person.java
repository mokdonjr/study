package classtest.model;

public class Person {
	public static final int SEED_OF_KOREAN_AGE = 1;
	
	private String name;
    private int age;
    
    public Person() { }
    
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
//	public void swapAge(Person target) {
//		int tempAge = this.age;
//		this.age = target.getAge();
//		target.setAge(tempAge);
//	}
	
	public int getKoreanAge() {
		return age + SEED_OF_KOREAN_AGE;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
