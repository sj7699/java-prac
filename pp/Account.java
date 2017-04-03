abstract public class Account implements Valuable {

	Account(double money)
	{
		balance=money;
	}
	private double balance;
	public void credit(double money)
	{
		balance+=money;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double money)
	{
		balance=money;
	}
	public void debit(double money)
	{
		balance-=money;
	}
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int i);

}