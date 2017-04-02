public  class SavingAccount extends Account {
	SavingAccount(double bal,double interest)
	{
		super();
		super.setBalance(bal);
		this.interest=interest;
	}
	private double interest;
	private int month=0;
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
	public double getWithdrawableAccount()
	{
		if(month<12)
		{
			return 0;
		}
		else
		{
			return super.getBalance();
		}
	}
	public void passTime(int month)
	{
		int interestMonth=0;
		this.month+=month;
		if(month>12)
		{
			interestMonth=12;
		}
		else
		{
			interestMonth=month;
		}
		super.setBalance(super.getBalance()*(Math.pow((1+interest),interestMonth )));
	}
}
