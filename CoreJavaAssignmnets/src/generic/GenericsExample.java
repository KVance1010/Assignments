package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		
		// generic class
		GenericPrinter<Integer> printer = new GenericPrinter<>(23);
		printer.print();
		
		GenericPrinter<Double> printer1 = new GenericPrinter<Double>(3.14);
		printer1.print();
		
		GenericPrinter<String> printer2 = new GenericPrinter<String>("hello");
		printer2.print();
			
		//generic method portion 
		shout("hello");
		shout(123);
		shout(3.14);
		
		combine("hello", 321);
		combine("hello", "!");
		combine(3.1415, "PI");
		
		// Printing a list of unknown objects... wild card
		List <Integer> myList = new ArrayList <> ();
		myList.add(3);
		myList.add(4);
		myList.add(5);
		
		List <Double> myList2 = new ArrayList <> ();
		myList2.add(3.14);
		myList2.add(3.1415);
		myList2.add(3.0);
		
		List <String> myList3 = new ArrayList <> ();
		myList3.add("one");
		myList3.add("Two");
		myList3.add("Three");
		
		printList(myList);
		printList(myList2);
		printList(myList3);
		
	}
	
	// generic method
	// one generic argument
	public static <T> void shout (T thing) {
		System.out.println(thing + "!!!!!");
	}
	
	// two generic arguments
	public static <T, V> void combine(T thing, V thing2) {
	    System.out.println(thing + " " + thing2);
	}
	
	// returning a generic type
	public static <T> T yell(T thing) {
		return thing;
	}
	
	// printing a list of unknown objects
	private static void printList(List<?> myList) {
		System.out.println(myList);
	}

}
