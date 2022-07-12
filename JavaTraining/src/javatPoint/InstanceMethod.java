package javatPoint;

public class InstanceMethod {
	
	public static void main(String [] args)  
	{  
	InstanceMethod obj = new InstanceMethod();  
	 
	System.out.println("The sum is: "+obj.add(12, 13));  
	}  
	int s;  
	public int add(int a, int b)  
	{  
	s = a+b;  
	return s;  
	}  


}
