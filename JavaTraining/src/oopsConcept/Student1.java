package oopsConcept;
public class Student1 
{
	int rollno;
	String name;
	
	public void insertRecord(int r, String n)
	{
		rollno = r;
		name = n;		
	}
	public void display_data()
	{
		System.out.println("Your name is..."+name);
		System.out.println("Your roll no is..."+rollno);
	}
}
