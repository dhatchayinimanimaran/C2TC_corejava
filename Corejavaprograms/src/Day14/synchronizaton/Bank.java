package Day14.synchronizaton;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MINBAL=5000; //fields are static and final
		static final int DAILY_LIMIT=25000;
		public abstract void deposit(int amt) throws DepositLimitExceedsException;
		void withdraw(int amt)throws InsufficientBalanceException; //public and abstract

	}

}
