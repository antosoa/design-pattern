package facade;

public class AccountNumberCheck {
	
	private int accountNumber = 1234533;
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public boolean accountActive(int acctNumber)
	{
		return acctNumber==getAccountNumber()?true:false;
	}

}
