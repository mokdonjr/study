package tostringtest;

import equalstest.Person;

public class MainApp {
	
	public static void main(String[] args) throws Exception {
		
		Person person = new Person();
		person.setName("백승찬");
		person.setAge(31);
		System.out.println(person.toString());
	}
}

