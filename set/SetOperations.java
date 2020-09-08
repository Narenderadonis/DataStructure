package set;

import java.util.*;

public class SetOperations {

	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<>();
		set1.add(1);
		set1.add(12);
		set1.add(23);
		Set<Integer> set2=new HashSet<>();
		set2.add(11);
		set2.add(1);
		set2.add(231);
//		set1.addAll(set2);    //union operation
//		System.out.println(set1);
		set1.retainAll(set2);// Interaction operation
		System.out.println(set1);
		System.out.println(set1.containsAll(set2)); //Subset operation // if all the elements of set2 is present in set1 or not
		

	}

}
