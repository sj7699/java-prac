public class CheckingAccount extends Account {
	private double interest,credit_limit,loan_interest,month;
	CheckingAccount(double a,double b,double c,double d)
	{
		super();
		super.setBalance(a);
		credit_limit=b;
		interest=c;
		loan_interest=d;
	}
	public double getWithdrawableAccount()
	{
		if((super.getBalance()+credit_limit)<0)
		{
			return 0;
		}
		else
		{
			
		return super.getBalance()+credit_limit;
		}

	}
	public void passTime(int month)
	{
		this.month+=month;
		if(super.getBalance()>=0)
		{
			super.setBalance(super.getBalance()*(Math.pow((1+interest),this.month )));
		}
		else
		{
			super.setBalance(super.getBalance()*(Math.pow((1+loan_interest),this.month )));
		}
	}
	public boolean isBankrupted(int money)
	{
		
	}
}

