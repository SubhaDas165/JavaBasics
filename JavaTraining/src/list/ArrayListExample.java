package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<String>();
		l.add("Mango");
		l.add("Apple");
		l.add("Grapes");
		l.add("Guava");
		System.out.println(l);
		System.out.println("................................");
		l.add(2, "Banana");
		System.out.println(l);
		System.out.println("----------------------------");
		l.sort(null);
		System.out.println(l);
		
		

	}

}
