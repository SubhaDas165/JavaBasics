package javatPoint;

public class GetSetMethod {

	private int roll;  
	private String name;  
	public int getRoll()     
	{  
		return roll;  
	}  
	public void setRoll(int roll) 
	{  
		this.roll = roll;  
	}  
	public String getName()   
	{  
		return name;  
	}  
	public void setName(String name)   
	{  
		this.name = name;  
	}  
	public void display()  
	{  
		System.out.println("Roll no.: "+roll);  
		System.out.println("Student name: "+name);  
	}  


}
