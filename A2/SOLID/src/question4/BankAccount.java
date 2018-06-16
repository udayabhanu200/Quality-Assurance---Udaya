package question4;

public class BankAccount
{
	protected float balance;


	
	public void Credit(float amount)
	{
		balance += amount;
	}

	public void Debit(float amount)
	{
		balance -= amount;
	}
}