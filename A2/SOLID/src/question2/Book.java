package question2;



public class Book implements BookInterface
{
	/*public Duration GetPlayTime() // forced to implement 
	{
		return Duration.ZERO; // Re factored code doesn't need this method here  
	}
	*/
	

	public String GetAuthor()
	{
		return "Hemingway";
	}

	
	
	public String GetTitle()
	{
		return "For Whom The Bell Tolls";
	}
	
	
	

	public boolean IsDigitalOnly()
	{
		return false;
	}
	
	
/*
	public ArrayList<String> GetCastList() // forced implement 
	{
		return null; 						// Re factored code doesn't need this method here  
	}
	*/
	
}