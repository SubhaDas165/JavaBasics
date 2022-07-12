package accesmodifiersEncapsulation;

public class EncapsulationDemo {
	public int rollno;
    public String name;
    private int age=10;

	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
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
		++age;
		System.out.println(age);
	}


}
