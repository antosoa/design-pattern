package state;

import proxy.ATMProxy;
import proxy.GetATMData;

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
		
		atmMachine.insertPin(1234);

		GetATMData realATMMachine = new ATMMachine();
		
		GetATMData atmProxy = new ATMProxy();
		
		System.out.println("\t Current ATM State" + atmProxy.getATMState());
		
	}

}
