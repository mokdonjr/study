package interfacetest;

public class AnimalKeeper {
	
	private Animal animal;

	public AnimalKeeper(Animal animal) {
		super();
		this.animal = animal;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public String conversationWithAnimal() {
		return "주인 : 안녕 애완동물아\n" + "애완동물 : " + animal.makeSound();
	}
}
