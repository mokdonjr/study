package equalstest;

import java.util.Date;

public class MainApp {
	
	public static void main(String[] args) throws Exception {
		
		// 이벤트 예약 시간
		Date reservedDate = new Date(1590686600000L);
		
		// 현재 시간
		Date currentDate = new Date();
		
		System.out.println(reservedDate.equals(currentDate));
	}
}
























//public class MainApp {
//	
//	public static void main(String[] args) throws Exception {
//		
//		// heap 메모리에 Person 타입의 인스턴스를 위한 메모리를 할당받아
//		// person 이라는 레퍼런스로 주소를 할당받는다.
//		Person person = new Person();
//		
//		// heap 메모리에 Person 타입의 인스턴스를 위한 메모리를 할당받아
//		// person2 이라는 레퍼런스로 주소를 할당받는다.
//		Person person2 = new Person();
//		
//		System.out.println(person.equals(person2));
//		System.out.println(!person.equals(person2));
//		
//		System.out.println(person.hashCode());
//		System.out.println(person2.hashCode());
//	}
//}


//public class MainApp {
//	
//	public static void main(String[] args) throws Exception {
//		
//		// heap 메모리에 Person 타입의 인스턴스를 위한 메모리를 할당받아
//		// person 이라는 레퍼런스로 주소를 할당받는다.
//		Person person = new Person();
//		
//		// person2 이라는 레퍼런스에 person 레퍼런스를 할당한다.
//		Person person2 = person;
//		
//		System.out.println(person.equals(person2));
//		System.out.println(!person.equals(person2));
//		
//		System.out.println(person.hashCode());
//		System.out.println(person2.hashCode());
//	}
//}


//public class MainApp {
//	
//	public static void main(String[] args) throws Exception {
//		
//		// heap 메모리에 Person 타입의 인스턴스를 위한 메모리를 할당받아
//		// person 이라는 레퍼런스로 주소를 할당받는다.
//		Person person = new Person();
//		
//		// person2 이라는 레퍼런스에 person 레퍼런스를 할당한다.
//		Person person2 = person;
//		
//		System.out.println(person == person2);
//		System.out.println(person != person2);
//		
//		System.out.println(person.hashCode());
//		System.out.println(person2.hashCode());
//	}
//}


//public class MainApp {
//	
//	public static void main(String[] args) throws Exception {
//		
//		// heap 메모리에 Person 타입의 인스턴스를 위한 메모리를 할당받아
//		// person 이라는 레퍼런스로 주소를 할당받는다.
//		Person person = new Person();
//		
//		// heap 메모리에 Person 타입의 인스턴스를 위한 메모리를 할당받아
//		// person2 이라는 레퍼런스로 주소를 할당받는다.
//		Person person2 = new Person();
//		
//		System.out.println(person == person2);
//		System.out.println(person != person2);
//		
//		System.out.println(person.hashCode());
//		System.out.println(person2.hashCode());
//	}
//}
