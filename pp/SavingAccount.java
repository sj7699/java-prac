public  class SavingAccount extends Account{
	public SavingAccount(double bal,double interest)
	{
		super(bal);
		this.interest=interest;
	}
	private double interest;
	private int month=0;
	@Override
	public void debit(double money) throws Exception
	{
		if(month<12)
		{
			throw new Exception("아직 출금할수없습니다");
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
		if(this.month<12 && 12<=this.month + month){
			super.setBalance(super.getBalance()*(Math.pow((1+interest),12)));
		}
		this.month+=month;
	}
	public String toString()
	{
		return String.format("SavingAccount_Balance:%.2f \n",super.getBalance());
	}
	public double EstimateValue(int month)
	{
		return super.getBalance()*(Math.pow((1+interest),month));
	}
}
