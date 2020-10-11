package multiinterfacetest;

public interface Flyable {
	
	void fly();
	
	default void sound() {
		System.out.println("부웅~");
	}

}
