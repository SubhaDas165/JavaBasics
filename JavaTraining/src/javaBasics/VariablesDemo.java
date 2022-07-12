package javaBasics;

public class VariablesDemo {
	int data = 50; 
	
	
	public static void main(String[] args)
	{
		int data=100;  
		System.out.println(data); 
		
		VariablesDemo  obj = new VariablesDemo(); 
		System.out.println(obj.data);
		
		
		VariablesDemo obj1;
		
		obj1 = new VariablesDemo();
		System.out.println(obj1.data);
	}


}
