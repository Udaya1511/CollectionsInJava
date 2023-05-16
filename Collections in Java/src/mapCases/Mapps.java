package mapCases;

import java.util.HashMap;

public class Mapps {
	
	public static void main(String[] args) {
		
		HashMap<String, String> Automationtools = new HashMap<String, String>();
		
		Automationtools.put("100", "Selenium");
		Automationtools.put("201", "QTP");
		Automationtools.put("106", "Appium");
		Automationtools.put("801", "Postman");
		Automationtools.put("186", "Jmeter");
		Automationtools.put("123", "Katalon");
		
		System.out.println(Automationtools);
		
		String ss = Automationtools.get("100");
		
		System.out.println(ss);
		
		
	}

}
