package exceptionHandling;

public class Finallly_Block{

	public static void main(String[] args) {
		try {
			int a=100;
			int b=0;
			int c=a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exception is handled");
		}
		finally {
			System.out.println("finally block");
		}

	}

}

