package abstraction;

public class ICICI implements RBI {

	@Override
	public void savingAccount() {
		// TODO Auto-generated method stub
		System.out.println("ICICI Saving");
	}

	@Override
	public void currentAccount() {
		// TODO Auto-generated method stub
		System.out.println("ICICI Current");
	}

	@Override
	public void DebitAccount() {
		// TODO Auto-generated method stub
		System.out.println("ICICI Debit");	
	}

	@Override
	public void CreditAccount() {
		// TODO Auto-generated method stub
		System.out.println("Credit Current");
	}
}
