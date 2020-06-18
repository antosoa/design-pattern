package state;

public class NoCash implements ATMState{
	
    ATMMachine atmMachine;
	
	public NoCash(ATMMachine newatmMachine)
	{
		atmMachine = newatmMachine;
	}

	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Non ci sono Fondi disponibili");
	}

	@Override
	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		System.out.println("Non ci sono Fondi disponibili");
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		System.out.println("Non ci sono Fondi disponibili");
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("Non ci sono Fondi disponibili");
	}

}
