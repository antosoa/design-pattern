package proxy;

import state.*; 

/*
 * 
 * questa classe limita l'accesso 
   alla classe ATMMachine, 
   si usa per questioni di sicurezza
 *
 */

public interface GetATMData {

	public ATMState getATMState();
	public int getCashInMachine();
	
}
