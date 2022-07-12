package javaBasics;

public class WhileLoop2 {

	public static void main(String[] args) 
	{
		boolean status = false;
		while(status)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(status+"of..."+i);
				if(i==5)
				{
					status=false;
				}
			}
			
		}
		
		status = true;
		
		while(status)
		{   
			for(int i=1;i<=5;)
			{
				System.out.println("This status is true");
				status = false;
				i++;
			}
			
		}
		

	}
}

