public class SavingAccount extends Account {
	private double interest;
	private double month=0;
	SavingAccount(double bal,double interest)
	{
		super();
		super.setBalance(bal);
		this.interest=interest;
	}
	@Override
	public void debit(double money)
	{
		if(month<12)
		{
			System.out.println("아직 출금할 수 없습니다.");
		}
		else
		{
			super.debit(money);
		}
	}
	@Override
	public double getWithdrawableAccount(double money)
	{
		double withdrawablemoney=0;
		return withdrawablemoney;
	}
	public void passTime(int month)
	{
		this.month+=month;
	}
}
