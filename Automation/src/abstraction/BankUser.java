package abstraction;

public class BankUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// we cannot create object of an interface.
		RBI bank1 = new HDFC();
		bank1.CreditAccount();
		bank1.currentAccount();
		bank1.DebitAccount();
		bank1.savingAccount();
		
		bank1 = new SBI();
		bank1.CreditAccount();
		bank1.currentAccount();
		bank1.DebitAccount();
		bank1.savingAccount();
		
		bank1 = new ICICI();
		bank1.CreditAccount();
		bank1.currentAccount();
		bank1.DebitAccount();
		bank1.savingAccount();

		
		
		
	}

}
