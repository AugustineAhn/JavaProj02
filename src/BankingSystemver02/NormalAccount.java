package BankingSystemver02;

public class NormalAccount extends Account{
	
	int rate;
	
	public NormalAccount(String account, String name) {

		super(account, name);
		bankAccount=account;
		bankOwner=name;
		bankBalance=1000;
		rate=2;
	
	}
}
