 package state;

public interface ATMState {

	void insertCard();
	void insertPin( int pinEntered );
	void requestCash( int cashToWithdraw );
	void ejectCard();

	
}
