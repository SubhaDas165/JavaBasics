package javaBasics;

public class Bike 
{
	String model;
	int year;
	public void bike_Engine()
	{
		System.out.println("Bike Engine Method Called....");
	}		
	  public Bike() 
	  { 
	
		  bike_Engine();
		  bike();
		  System.out.println("Bike Constructor Called..."); 
	  }
	  public Bike(String model, int year)
	  {
		  
		  this.model = model;
		  this.year = year;
		  System.out.println(this.model);
		  System.out.println( this.year);
	  }
	 
	public void bike()
	{ 
		System.out.println("Bike method is called...");
	}

}

