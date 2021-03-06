package collectionsandmaps;
import java.util.*;

public class CollectionAssisted {

	public static void main(String[] args) {
		//creating ArrayList
				System.out.println("ArrayList");
				ArrayList<String> city=new ArrayList<String>();   
			      city.add("Bangalore");//
			      city.add("Delhi");  
			      city.add("Anaheim");
			      Collections.sort(city);
			      for (String homeCity : city) {
			      System.out.println(homeCity);  
			      }
				//creating vector
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> vec = new Vector<Integer>();
			      vec.addElement(15); 
			      vec.addElement(30);
			      System.out.println(vec);
				
				//creating LinkedList
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> names =new LinkedList<String>();  
			      names.add("Alex");  
			      names.add("John");
			      names.add("Alexa");
			      names.descendingIterator();
			      Iterator<String> itr =names.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			       
			       //creating HashSet
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(101);  
			       set.add(103);  
			       set.add(102);
			       set.add(104);	       
			       System.out.println(set);
			       
			       //creating LinkedHashset
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(11);  
			       set2.add(13);  
			       set2.add(12);
			       set2.add(14);	       
			       System.out.println(set2);
			      	} 
	}

}
