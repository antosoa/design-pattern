package facade;

public class SecurityCodeCheck {
	
	private static int code= 1234;
	
	
	public static boolean isCodeCorrect(int code)
	{
		return code == getCode()?true:false;
	}


	public static int getCode() {
		return code;
	}

 
}
