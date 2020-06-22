package proxy;

import state.ATMMachine;
import state.ATMState;

/*
 * crea e distrugge oggetti ATMMachine
 * e fornisce accesso solo a quei metodi che riteniamo 
 * sicuri poter essere utilizzati dall'esterno
 */

public class ATMProxy implements GetATMData {

	@Override
	public ATMState getATMState() {
	    
		ATMMachine realATMMachine = new ATMMachine();
		
		return realATMMachine.getATMState();
	
	}

	@Override
	public int getCashInMachine() {

		ATMMachine realATMMachine = new ATMMachine();
		
		return realATMMachine.getCashInMachine();		 
	}

}
