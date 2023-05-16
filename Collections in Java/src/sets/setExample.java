package sets;

import java.util.HashSet;
import java.util.Iterator;

public class setExample {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Apple");
		set.add("Mango");
		set.add("Strawbery");
		set.add("Apple");
		set.add("Tomoto");
		set.add("Beetroot");
		
		System.out.println(set);
		
		for(String value : set) {
			
			System.out.println("Elements are: " + value);
		}
		
		
	}

}
