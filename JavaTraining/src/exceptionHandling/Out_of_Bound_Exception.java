package exceptionHandling;

public class Out_of_Bound_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int [2];
			a[0]=22;
			a[1]=9;
			System.out.println(a[8]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException "+e);
		}
		
		

	}

}
