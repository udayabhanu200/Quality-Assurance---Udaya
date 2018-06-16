package question4;

public class USDollarAccount extends BankAccount implements AccountBalance
{
	static final float EXCHANGE_RATE = 0.75f;

	/*public void Credit(float amount)  // these methods modifying the code of Base class Bank Account
	{
		balance += amount * EXCHANGE_RATE;
	}

	public void Debit(float amount)
	{
		balance -= amount * EXCHANGE_RATE;
	}*/
	public float GetBalance(){
		
		return balance*EXCHANGE_RATE;
	}
}