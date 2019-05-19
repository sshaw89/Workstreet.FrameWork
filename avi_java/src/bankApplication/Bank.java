package bankApplication;

public class Bank {

	public static void main(String[] args) {
		SavingsAccount account1 = new SavingsAccount(5000.00);
		account1.deposit(1000);
		account1.balanceEnquirey();
		account1.withdrow(1500);
		account1.balanceEnquirey();
		
		System.out.println("=========================");
		
		LoanAccount account2 = new LoanAccount(50000.00);
		account2.deposit(30000.00);
		account2.balanceEnquirey();
		account2.withdrow(10000.00);
		account2.balanceEnquirey();
		

	}

}
