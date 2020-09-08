package map;


import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		Map<String,Integer> num=new HashMap<>();
		num.put("One",1);
		num.put("Two",2);
		num.put("Three",3);
		num.put("Four",4);
		//num.put("One",10); this will update previous value
		num.putIfAbsent("One",10);// it will put the value if the previous value is absent
		num.remove("Two");
		System.out.println(num);
		System.out.println(num.get("Three"));
		System.out.println(num.containsKey("One"));
		System.out.println(num.containsValue(2));
		System.out.println(num.keySet());
		System.out.println(num.values());
		System.out.println(num.entrySet());
		Set<Entry<String, Integer>> entries=num.entrySet();
		for(Entry<String,Integer> entry:entries) {
			entry.setValue(entry.getValue()*100);
		}
		
		System.out.println(num);

	}

}
