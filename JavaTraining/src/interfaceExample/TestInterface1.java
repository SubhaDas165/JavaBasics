package interfaceExample;

public class TestInterface1 implements RBIBank,Test1 {
	public static void main(String[] args) 
	{		
		Test1 obj = new TestInterface1();
		 obj.test1();
	

	}

	@Override
	public int rateOfInterest() {
		// TODO Auto-generated method stub
		return 10;
	}

	

	@Override
	public void test1() {
		System.out.println("Hello this is test1 method");
		
	}

}
