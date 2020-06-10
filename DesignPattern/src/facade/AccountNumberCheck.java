package facade;

public class AccountNumberCheck {
	
	private static int accountNumber = 1234533;
	
	public static int getAccountNumber()
	{
		return accountNumber;
	}
	
	public static boolean accountActive(int acctNumber)
	{
		return acctNumber == getAccountNumber()?true:false;
	}

}
