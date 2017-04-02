
public class AccountTest {
public static void main(String[] args)
{
	Account account1 = new Account();
	Account account2 = new Account();
	account1.credit1(50);
	account2.credit1(0);
	System.out.printf("account1 balance: %f\n",account1.balance1());
	System.out.printf("account2 balance: %f\n",account2.balance1());
	account1.debit1(0);
	System.out.printf("account1 balance: %f\n",account1.balance1());
	System.out.printf("account2 balance: %f\n",account2.balance1());
	account2.debit1(0);
	System.out.printf("account1 balance: %f\n",account1.balance1());
	System.out.printf("account2 balance: %f\n",account2.balance1());
}
}
