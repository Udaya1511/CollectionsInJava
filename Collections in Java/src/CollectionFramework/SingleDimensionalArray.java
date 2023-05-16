package CollectionFramework;

import java.util.Iterator;

public class SingleDimensionalArray {
	
	public static void main(String[] args) {
		
		int StudentID[] = new int[5];
		
		
		
		StudentID[0] = 11111;
		StudentID[1] = 22222;
		StudentID[2] = 33333;
		StudentID[3] = 44444;
		StudentID[4] = 55555;
		
		
//		System.out.println(StudentID[0]);
//		System.out.println(StudentID[1]);
//		System.out.println(StudentID[2]);
//		System.out.println(StudentID[3]);
//		System.out.println(StudentID[4]);
		
		for (int i = 0; i < StudentID.length; i++) {
			System.out.println(StudentID[i]);
		}
		
		
		
	}

}
