package List;

import java.util.ArrayList;

public class ArrayListt {
	
	public static void main(String[] args) {
		
		ArrayList<String> Al = new ArrayList();
		
		Al.add("Selenium");
		Al.add("Java");
		Al.add("Api");
		Al.add("SQL");
		Al.add("TestNG");
		Al.add("Cucumber");
		
		String result = Al.get(2);
		System.out.println(result);
		
		System.out.print(Al);
	
	}
}
