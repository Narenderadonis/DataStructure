package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		Set<String> fruits=new HashSet<>();//does not maintain order
		Set<String> fruits1=new LinkedHashSet<>();//return order wise 
		Set<String> fruit2=new TreeSet<>();    //return in sorted order
		
		
		fruits1.add("Apple");
		fruits1.add("Banana");
		fruits1.add("Kiwi");
		//System.out.println(fruits.add("Banana"));
		System.out.println(fruits1);
		

	}

}
