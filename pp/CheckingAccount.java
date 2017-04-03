public class CheckingAccount extends Account{
	private double interest,credit_limit,loan_interest;
	private int month;
	public CheckingAccount(double a,double b,double c,double d)
	{
		super(a);
		credit_limit=b;
		interest=c;
		loan_interest=d;
		this.month=0;
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
			super.setBalance(super.getBalance()+super.getBalance()*this.interest*month);
		}
		else
		{

			super.setBalance(super.getBalance()+super.getBalance()*this.loan_interest*month);
		}
	}
	public boolean isBankrupted()
	{
		if((super.getBalance()+credit_limit)<0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		return String.format("CheckingAccount_Balance:%.2f \n",super.getBalance());
	}
	public double EstimateValue(int month)
	{
		return super.getBalance()+super.getBalance()*this.interest*month;
	}
}

