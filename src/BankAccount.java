
public class BankAccount {
private double balance;

public BankAccount(double balance) {
	this.balance = balance;
}

public void withDraw(double withdrawl) throws NegativeBalanceException {
	if(balance-withdrawl<0) {
		throw new NegativeBalanceException(balance-withdrawl);
	}
	else {
		balance -= withdrawl;
	}
}

public void quickWithDraw(double withdrawl) throws NegativeBalanceException {
	balance -= withdrawl;
	if(balance<0) {
		balance += withdrawl;
		throw new NegativeBalanceException();
	}
}
}
