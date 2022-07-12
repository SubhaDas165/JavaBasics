package finalkeyword;

public class FinalizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeMethod obj=new FinalizeMethod();
		System.out.println(obj.hashCode());
		obj=null;
		System.gc();
		System.out.println("garbage collection");

	}
	
	protected void finalize() {
		System.out.println("finalize method called");  
	}

}
