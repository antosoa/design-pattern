package facade;

public class TestBankAccount {

	public static void main(String[] args)
	{
	
		BankAccountFacade accessingBank = new BankAccountFacade(1212221, 1234);
		
		accessingBank.withdraw(100.0);
		accessingBank.withdraw(928.0);
		accessingBank.depositCash(3004.0);
		
		
	}
}
