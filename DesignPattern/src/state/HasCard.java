package state;

public class HasCard implements ATMState {
	
	ATMMachine atmMachine;

	public HasCard(ATMMachine newatmMachine) {
		// TODO Auto-generated constructor stub
		atmMachine = newatmMachine;
	}

	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Non puoi inserire più di una carta");
	}

	@Override
	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		if(pinEntered == 1234)
		{
			System.out.println("Correct Pin");
			atmMachine.correctPinEntered = true;
			atmMachine.setATMState(atmMachine.getHasPin());
		} else
		{
			System.out.println("Incorrect Pin");
			atmMachine.correctPinEntered = false;
			System.out.println("Carta rimossa");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
	
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		System.out.println("Enter Pin First");
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("Carta rimossa");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

}
