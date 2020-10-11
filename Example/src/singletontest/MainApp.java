package singletontest;

public class MainApp {

	public static void main(String[] args) {
		
		// 불가능!
//		Counter counter = new Counter();
		
		// OK~
		Counter counterStatic = Counter.getInstance();
		
	}
}
