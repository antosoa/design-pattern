package facade;

public class FundsCheck {

	private static double fundAmount = 66543;
	
	
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
	
}
