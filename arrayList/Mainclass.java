package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Mainclass {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<String> vegitable=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("banana");
        vegitable.add("Potato");
        vegitable.add("Tomato");
        vegitable.add("carrot");
        
//        System.out.println(fruits);
//        System.out.println(vegitable);
//        fruits.addAll(vegitable);
//        System.out.println(fruits);
//        System.out.println(fruits.get(2));
//        fruits.set(1,"mango");
//        System.out.println(fruits);
//        vegitable.remove(2);
//        System.out.println(vegitable);
//        System.out.println(fruits);
        
//         List<String> toremove=new ArrayList();
//         toremove.add("banana");
//         toremove.add("Apple");
//          fruits.removeAll(toremove);
//          System.out.println(fruits);
        
        
        
        
        System.out.println(vegitable.size());
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.isEmpty());
        String temp[]=new String[fruits.size()];
         fruits.toArray(temp);
         for(String e: temp) {
        	 System.out.println(e);
         }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Pair<String, Integer> p1=new Pair("Naren",25);
//        Pair<Boolean, String> p2=new Pair(true,"yes");
//        p1.getDescription();
//        p2.getDescription();
	}

}
