package javaBasics;

public class IFElseExample {

	public static void main(String[] args) 
	{
		 int Year=2020;
		 
		 if(((Year % 4 == 0)&&(Year % 100 != 0)) || (Year % 400 == 0))
		 {
			 System.out.println("Leap Year");
		 }
		 else
		 {
			 System.out.println("Common Year");
		 }

	}

}
