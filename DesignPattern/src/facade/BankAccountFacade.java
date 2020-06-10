package facade;

public class BankAccountFacade {
	
	private boolean accountCheck = false;
	private boolean codeCheck = false;
	
	public BankAccountFacade(int acctNumber, int code) {
		// TODO Auto-generated constructor stub
		accountCheck = AccountNumberCheck.accountActive(acctNumber);
		codeCheck = SecurityCodeCheck.isCodeCorrect(code);
	}

	public void withdraw(double d) {
		// TODO Auto-generated method stub
		if(isAccountCheck() && isCodeCheck() && FundsCheck.isFundAvailable(d))
		{
		System.out.println("Autenticazione corretta, saldo Account: " + FundsCheck.getFundAmount() 
						   + " /n prelevati " + d + 
						   " Euro dall'Account " + AccountNumberCheck.getAccountNumber());
	     FundsCheck.withdrawCash(d);	
		}
	}

	public void depositCash(double d) {
		// TODO Auto-generated method stub
		
	}

	public boolean isAccountCheck() {
		return accountCheck;
	}

	public boolean isCodeCheck() {
		return codeCheck;
	}
	
	

}
