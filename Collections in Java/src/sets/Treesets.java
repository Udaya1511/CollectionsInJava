package sets;

import java.util.TreeSet;
;
public class Treesets {
	
	public static void main(String[] args) {
		
		TreeSet<String> Ts = new TreeSet<String>();
		
		Ts.add("Manago");
		Ts.add("Apple");
		Ts.add("Tomoto");
		Ts.add("Banana");
		Ts.add("JackFruit");
		Ts.add("Pototo");
		
		System.out.println(Ts);
		
		for (String names : Ts) {
			System.out.println(names);
		}
		
	}

}
