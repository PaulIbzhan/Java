package javaworkshop;

import java.util.ArrayList;
import java.util.ListIterator;
public class workshop {
	public static void main(String[] args) {
		ArrayList<Integer> numbers= new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.print("ArrayList: "+numbers);
		
		ListIterator<Integer> iterate = numbers.listIterator();
		int number=iterate.next();
	    System.out.println("Next Element: " + number);
	     
	    int index=iterate.nextIndex();
	    System.out.print(index);
	}
}