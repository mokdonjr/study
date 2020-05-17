package classtest;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import classtest.model.Person;
import classtest.util.FileUtil;

public class MainApp {

	static List<String> footballPlayerList = new ArrayList<>();
	
	static {
		String content = FileUtil.readFile("C:\\dev-repository\\studyJava\\Example\\test.txt");
		StringTokenizer tokenizer = new StringTokenizer(content, ", ");
		while (tokenizer.hasMoreTokens()) {
			footballPlayerList.add(tokenizer.nextToken());
		}
	}
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.setName("º’»ÔπŒ");
		person1.setAge(28);
		System.out.println(person1.getKoreanAge());
		
		Person person2 = new Person();
		person2.setName("¿ÃªÛ»≠");
		person2.setAge(30);
		System.out.println(person2.getKoreanAge());
	}
}
