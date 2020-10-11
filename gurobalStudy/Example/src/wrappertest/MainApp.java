package wrappertest;

public class MainApp {
	
	public static void main(String[] args) {
//		testNewInteger();
		testNewInteger2();
	}

	public static void testNewInteger() {
		System.out.println("==================test1==================");
		Integer a = Integer.valueOf(10);
		Integer b = Integer.valueOf(20);
		System.out.println(a != b);
		
		a = 200;
		System.out.println(a);
		
		
		var i = Integer.valueOf(10);
		Integer e = Integer.valueOf(10);
		Integer f = Integer.valueOf(10);
		System.out.println(e != f);
	}
	
	public static void testNewInteger2() {
		System.out.println("==================test2==================");
		Integer a = 128;
		Integer b = 128;
		System.out.println(a == b);
		
		Integer c = 127;
		Integer d = 127;
		System.out.println(c == d);
		
	}
}
