package javaBasics;

public class VaiablesDemo1 {
static int result=100;
	
	public void add()
	{
		int a = 10;
		int b = 20;
		int result = a + b;
		System.out.println("Added value is..(local variable)"+result);
	}

	public static void main(String[] args) 
	{
		int result = 50;
		System.out.println("The local variable value is.."+result);
		System.out.println("This is static variable value.."+VaiablesDemo1.result);
		
		VaiablesDemo1 obj = new VaiablesDemo1();
		obj.add();
		 
	}

}
