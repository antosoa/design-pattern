package facade;

public class FundsCheck {

	private static double fundAmount = 2000;
	
	
	public static double getFundAmount() {
		return fundAmount;
	}

 
	public static boolean isFundAvailable(double value)
	{
		return value<fundAmount?true:false;
	}
	
	public static void withdrawCash(double value)
	{
		fundAmount=fundAmount-value;
	}
	
	public static void makeDeposit(double value)
	{
		fundAmount=fundAmount+value;
	}
	
}
