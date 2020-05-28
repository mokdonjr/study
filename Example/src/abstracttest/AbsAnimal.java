package abstracttest;

public abstract class AbsAnimal implements Animal {

	@Override
	public String makeSound() {
		return "아무 소리 안남";
	}

	@Override
	public int getLegCount() {
		return 0;
	}
	
}
