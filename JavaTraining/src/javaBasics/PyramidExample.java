package javaBasics;

public class PyramidExample {

	public static void main(String[] args) 
	{
		int max=10;
		 for(int i=1;i<=max;i++)
		 {
			 for(int j=max;j>=i;j--)
			 {
				 System.out.print("*");
			 }
			 System.out.println(); 
		 }

	}

}