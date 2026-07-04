package day8;
import java.util.TreeSet;

//TreeSet - Similar Data (Generic Collection)
public class Demo6 {
	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();	
		
		treeSet.add(10);
		treeSet.add(40);
		treeSet.add(30);
		treeSet.add(50);
		treeSet.add(20);
		treeSet.add(10);
		
		System.out.println(treeSet);
	}
}

