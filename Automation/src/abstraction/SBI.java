package abstraction;

public class SBI implements RBI {

	@Override
	public void savingAccount() {
		// TODO Auto-generated method stub
		System.out.println("SBI Saving");
	}

	@Override
	public void currentAccount() {
		// TODO Auto-generated method stub
		System.out.println("SBI Current");
	}

	@Override
	public void DebitAccount() {
		// TODO Auto-generated method stub
		System.out.println("SBI Debit");	
	}

	@Override
	public void CreditAccount() {
		// TODO Auto-generated method stub
		System.out.println("Credit Current");
	}
}
