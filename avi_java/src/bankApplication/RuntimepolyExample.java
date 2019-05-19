package bankApplication;

public class RuntimepolyExample {

	public static void main(String[] args) {
		BankAccount account1 = new SavingsAccount(300);//upcast
		account1.deposit(400.50);  // see here due to overriding implementation changes
		account1.balanceEnquirey();
		account1.withdrow(200.99);
		account1.balanceEnquirey();
        
		System.out.println("=======================");
		BankAccount account2 = new LoanAccount(3000.00);//upcasting
		account2.deposit(2000.00);
		account2.balanceEnquirey();
		account2.withdrow(1000.99);
		account2.balanceEnquirey();
	}

}
