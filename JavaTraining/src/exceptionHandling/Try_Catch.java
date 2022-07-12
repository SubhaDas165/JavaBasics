package exceptionHandling;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			int a=100;
			int b=0;
			int c=a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exception is handled");
		}

	}

}
