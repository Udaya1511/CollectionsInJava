package sets;

import java.util.LinkedHashSet;

public class LinketHashset {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> sets = new LinkedHashSet<String>();
		
		sets.add("Apple");
		sets.add("Mango");
		sets.add("Strawbery");
		sets.add("Apple");
		sets.add("Tomoto");
		sets.add("Beetroot");
		
		System.out.println("Elements are :" + sets);
		
		for (String names : sets) {
			System.out.println("Elemenets are : " + names);
		}
		
	}
	
	

}
