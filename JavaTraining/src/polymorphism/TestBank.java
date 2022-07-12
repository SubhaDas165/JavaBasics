package polymorphism;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriddingBank b=new BankABC();
		int a=b.getInterest();
		System.out.println(a);

	}

}
