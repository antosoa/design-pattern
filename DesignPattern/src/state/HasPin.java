package state;

public class HasPin implements ATMState {

	ATMMachine atmMachine;
	
	public HasPin(ATMMachine newatmMachine)
	{
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
		System.out.println("Pin già inserito");
	
	}
	
	@Override
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		if(cashToWithdraw > atmMachine.cashInMachine)
		{
			System.out.println("Deposito insufficiente, impossibile prelevare");
			System.out.println("Carta rimossa");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
		else
		{
			System.out.println("Prelevare il denaro " +cashToWithdraw);
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
			
			System.out.println("Carta rimossa");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
			if(atmMachine.cashInMachine <=0)
		   atmMachine.setATMState(atmMachine.getNoCashState());
		}
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("Carta rimossa");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

}
