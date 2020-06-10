package facade;

public class TestBankAccount {

	public static void main(String[] args)
	{
	
		BankAccountFacade accessingBank = new BankAccountFacade(1234533, 1234);
		
		accessingBank.withdraw(900.0);
		accessingBank.withdraw(500.0);
		accessingBank.depositCash(350.0);
		
		
	}
}
