package test;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		// 배열 선언
		int[] arrInt = new int[10];
		
		// 배열 for loop 순회
		for (int i = 0; i < arrInt.length; i++) {
			// 배열 값 할당
			arrInt[i] = i;
		}
		
		// 배열 for-each loop 순회
		for (int item : arrInt) {
			System.out.println(item);
		}
		
	}

}
