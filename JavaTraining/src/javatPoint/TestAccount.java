package javatPoint;

public class TestAccount{  
	public static void main(String[] args){  
	Account a1=new Account();  
	a1.insert(55525331,"Ram",10000000);  
	a1.display();  
	a1.checkBalance();  
	a1.deposit(50000);  
	a1.checkBalance();  
	a1.withdraw(52000);  
	a1.checkBalance();  
	}
} 
