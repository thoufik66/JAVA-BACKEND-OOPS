package day8;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Demo7 {

	public static void main(String[] args) {

		HashMap<String,Integer> hashmap=new HashMap();
		hashmap.put("virat", 100);
		hashmap.put("Sachin", 80);
		hashmap.put("Hardik", 40);
		hashmap.put("Mahi", 50);
		hashmap.put("Bumrah", 2);

	
		System.out.println(hashmap);
		System.out.println(hashmap.isEmpty());
		System.out.println(hashmap.containsKey("virat"));
		System.out.println(hashmap.containsValue(100));
		System.out.println(hashmap.get("Bumrah"));
        Set<String> keys=hashmap.keySet();
        System.out.println(keys);
        
       Collection<Integer> values=hashmap.values();
       System.out.println(values);
       
       
	}

} 
