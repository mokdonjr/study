package interfacetest;

public class MainApp {
	
	public static void main(String[] args) {
		
		Animal cat = new Cat();
		System.out.println(cat.makeSound());
		
		Animal dog = new Dog();
		System.out.println(dog.makeSound());
		
		Animal duck = new Duck();
		System.out.println(duck.makeSound());
		
		AnimalKeeper keeper = new AnimalKeeper(cat);
		System.out.println(keeper.conversationWithAnimal());
	}

}
