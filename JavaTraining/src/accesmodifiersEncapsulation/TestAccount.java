package accesmodifiersEncapsulation;

public class TestAccount {

	public static void main(String[] args) {
		Account ac= new Account();
		ac.setAccno(524225222522l);
		ac.setAmount(550.0f);
		ac.setEmail("subha4613@gmail.com");
		ac.setName("Subha Das");
		System.out.println("Name: "+ac.getName());
		System.out.println("Email: "+ac.getEmail());
		System.out.println("A/C: "+ac.getAccno());
		System.out.println("Bal: "+ac.getAmount());

	}

}
