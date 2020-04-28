package calltest;

public class CallByValueTest {
	
	public static void main(String[] args) {
	
		int a = 10;
		int b = -1;
		
		// call by value
		swap(a, b);
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	
}
