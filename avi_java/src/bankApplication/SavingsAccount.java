package bankApplication;

public class SavingsAccount extends BankAccount {
	double accbal;
	public SavingsAccount(double inibal)
	{
		accbal = inibal;
	}
	void deposit(double amt) 
	{
		accbal = accbal+amt;
		System.out.println(amt+"/ rs deposited ");
	}
	void withdrow(double amt)
	{
		accbal = accbal-amt;
		System.out.println(amt+"/ rs withdrown");
	}
	void balanceEnquirey()
	{
		System.out.println("total balance is "+accbal);
	}

}
