package multiinterfacetest;

public interface Parkable {
	
	void park();
	
	default void sound() {
		System.out.println("끼익~");
	}

}
