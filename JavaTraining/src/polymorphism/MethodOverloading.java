package polymorphism;

public class MethodOverloading {
	public void fbLogin(long phno,String pw) {
		System.out.println("Login using phone number and password");
	}
	public void fbLogin(String Email,String pw) {
		System.out.println("Login using Email ID and password");
	}

}
