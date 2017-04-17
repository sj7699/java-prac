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
	public void debit(double money) throws Exception
	{
		if(money <0)
		{
			throw new Exception ("음수입력!");
		}
		if(money > balance)
		{
			throw new Exception (": Debit amount exceeded account balance.");
		}
		balance-=money;
	}
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int i);
	public abstract void passTime();

}