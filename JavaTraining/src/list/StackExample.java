package list;

import java.util.List;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Double> s=new Stack<Double>();
		s.push(5.2);
		s.push(3.3);
		s.push(8.14);
		s.push(2.20);
		s.push(1.02);
		System.out.println(s);
		System.out.println("-----------------------------------------");
		System.out.println(s.peek());
		System.out.println("-----------------------------------------");
		s.pop();
		s.pop();
		System.out.println(s.peek());
		System.out.println("------------------------------------------");
		System.out.println(s);
		s.sort(null);
		System.out.println(s);

	}

}
