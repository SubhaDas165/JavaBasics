package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new LinkedList<Integer>();
		l1.add(5);
		l1.add(88);
		l1.add(52);
		l1.add(22);
		l1.add(522);
		System.out.println(l1);
		l1.add(2, null);
		System.out.println(l1);
	
	}

}
