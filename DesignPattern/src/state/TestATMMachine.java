package state;

public class TestATMMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATMMachine atmMachine = new ATMMachine();
		
		atmMachine.insertCard();
		
		atmMachine.ejectCard();
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(1234);
		
		System.out.println("<< Denaro Residuo : " + atmMachine.cashInMachine +" >>");
		
		atmMachine.requestCash(550);
		
		System.out.println("<< Denaro Residuo : " + atmMachine.cashInMachine +" >>");
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(1123);

	}

}
