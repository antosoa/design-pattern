package state;

import proxy.GetATMData;

/*
 * Context (Account)
 * Maintains an instance of a ConcreteState subclass that defines the current state
 */

public class ATMMachine implements GetATMData{
	
	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;

	ATMState atmState;
	int cashInMachine = 1000;
	boolean correctPinEntered = false;
	
	
	public ATMMachine()
	{
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);
		
		atmState = noCard;
		
		if(cashInMachine < 0)
			atmState = atmOutOfMoney;
				
	}
	
	public void setATMState(ATMState newATMState)
	{
		atmState = newATMState;
    }
	
	public void setCashInMachine(int newCashInMachine)
	{
		cashInMachine = newCashInMachine;
	}
	
	public void insertCard()
	{
		atmState.insertCard();
	}
	
	public void ejectCard()
	{
		atmState.ejectCard();
	}
	
	public void requestCash(int cashToWithdraw)
	{
		atmState.requestCash(cashToWithdraw);
	}
	
	public void insertPin(int pinEntered)
	{
		atmState.insertPin(pinEntered);
	}
	
	public ATMState getYesCardState() { return hasCard; }
	public ATMState getNoCardState() { return noCard; }
	public ATMState getHasPin() { return hasCorrectPin; }
	public ATMState getNoCashState() { return atmOutOfMoney; }

	
	@Override
	public ATMState getATMState() {
		// TODO Auto-generated method stub
		return atmState;
	}

	@Override
	public int getCashInMachine() {
		// TODO Auto-generated method stub
		return cashInMachine;
	}
	
	
	

}
