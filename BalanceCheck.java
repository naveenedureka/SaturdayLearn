class LowBalanceException extends Exception
{
	private double amount;

	public LowBalanceException(double amount) {
		this.amount = amount;

	}
	public double getBalance()
	{
		return amount;
	}

}
public class BalanceCheck {
	private double balance;
	private int id;
	
	public BalanceCheck(double balance, int id) {
		super();
		this.balance = balance;
		this.id = id;
	}
	public void deposite(double amount)
	{
		balance+=amount;

	}
	public void withdraw(double amount)throws LowBalanceException
	{
		if(amount<=balance)
		{
			balance-=amount;
		}else
		{
			double requirement=	amount-balance;
			throw new LowBalanceException(requirement);
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


}
