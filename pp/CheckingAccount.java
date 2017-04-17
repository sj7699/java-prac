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
	@Override
	public void debit(double money) throws Exception
	{
		if(money <0)
		{
			throw new Exception ("음수입력!");
		}
		if(money > this.getWithdrawableAccount())
		{
			throw new Exception (": Debit amount exceeded account balance.");
		}
		super.setBalance(super.getBalance()-money);
	}
	public void passTime()
	{
		this.month+=1;
		if(super.getBalance()>=0)
		{
			super.setBalance(super.getBalance()+super.getBalance()*this.interest*1);
		}
		else
		{

			super.setBalance(super.getBalance()+super.getBalance()*this.loan_interest*1);
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
	public double EstimateValue()
	{
		return super.getBalance()+super.getBalance()*this.interest*1;
	}
}

