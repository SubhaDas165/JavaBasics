package interfaceExample;

public class TestInteface {
	public static void main(String[] args) 
	{
		SBIBank obj = new SBIBank();
		System.out.println(obj.rateOfInterest());
		
		
		RBIBank obj1 = new SBIBank();
		System.out.println(obj1.rateOfInterest());
		
		
		RBIBank obj2 = new ICICI();
		System.out.println(obj2.rateOfInterest());
		
		RBIBank obj3 = new CITIBank();
		System.out.println(obj3.rateOfInterest());
		
		 

	}

}
