package state;

public class NoCard implements ATMState {

	ATMMachine atmMachine;

	public NoCard(ATMMachine newatmMachine) {
		// TODO Auto-generated constructor stub
		atmMachine = newatmMachine;
	}
	 
	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Inserisci un Pin, grazie");
		atmMachine.setATMState(atmMachine.getYesCardState());
		
	}

	@Override
	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		System.out.println("Inserisci una carta prima");
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		System.out.println("Inserisci una carta prima");
		
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("Inserisci una carta prima");
	}

}
