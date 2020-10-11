package stringconstantpooltest;

public class MainApp {
	
	public static void main(String[] args) {
		
		String str1 = new String("Gurobal");
		String str2 = new String("Gurobal");
		String str3 = "Gurobal";
		String str4 = "Gurobal";
		
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		System.out.println(str3 == str4);
	}

}
