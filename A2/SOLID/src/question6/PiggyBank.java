package question6;


public class PiggyBank implements CurrencyCoinsDeposit
{
	int numPennies;
	int numDimes;
	int numNickels;
	int numQuarters;

	public PiggyBank()
	{
		numPennies = 0;
		numDimes = 0;
		numNickels = 0;
		numQuarters = 0;
	}

	public void  AddPenny()
	{
		 numPennies += 1;
	}

	public void AddDime()
	{
		 numDimes += 1;
	}

	public void  AddNickel()
	{
		numNickels += 1;
	}

	public void AddQuarter()
	{
		 numQuarters += 1;
	}


	// to check the balance of each currency coin	
	
	public int CheckPenny(){
		return numPennies;
	}
	public int CheckDime(){
		return numDimes;
	}
	public int CheckNickel(){
		return 	numNickels;
	}
	public int CheckQuarter(){
		
		return numQuarters;
	}
	
}