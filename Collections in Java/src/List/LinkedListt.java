package List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListt {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("X");
		list.add("Y");
		list.add("Z");
		list.add("A");
		list.add("B");
		list.add("C");
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.addAll(list);
		System.out.println(list2);
		
		Collections.sort(list2);
		System.out.println(list2);
		
		Collections.reverse(list2);
		System.out.println(list2);
		
		Collections.shuffle(list2);
		System.out.println(list2);
		
		
		
	}
	
	

}
