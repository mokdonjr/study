package calltest;

public class CallByReferenceTest {

	public static void main(String[] args) {
		
		CallByReferenceModel a = new CallByReferenceModel(10);
		CallByReferenceModel b = new CallByReferenceModel(-1);
		
		// call by reference
		swap(a, b);
		
		System.out.println("a : " + a.getValue());
		System.out.println("b : " + b.getValue());
	}
	
	public static void swap(CallByReferenceModel x, CallByReferenceModel y) {
		int temp = x.getValue();
		x.setValue(y.getValue());
		y.setValue(temp);
	}
}
