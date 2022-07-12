package oopsConcept;

public class Test 
{
	public void startEngine()
	{
		System.out.println("Car Engine Started Sucessfully..");
	}
	public void stopEngine()
	{
		System.out.println("Car Engine Stopped Sucessfully..");
	}
	public void start_MusicSystem()
	{
		System.out.println("Car Music System is running...");
	}
	
	public void start_A_C()
	{
		System.out.println("Car Air conditioning is running..");
	}
	
	public static void main(String[] args)
	{
		 Test key = new Test(); // key is object and Car is class 
		 
		 key.startEngine();
		 
		 key.start_MusicSystem();
		 
		 key.stopEngine();
		 
		 System.out.println("This is Key2 Funcationality...");
		 
		 Test key1 = new Test(); 
		 
           key1.startEngine();
		 
		 key1.start_MusicSystem();
		 
		 key1.start_A_C();
		 
		 key1.stopEngine(); 			

	}
}

