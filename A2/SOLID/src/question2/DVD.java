package question2;

import java.time.Duration;
import java.util.ArrayList;

public class DVD implements ILibraryItem
{
	public Duration GetPlayTime()
	{
		return Duration.ofMinutes(135);
	}

	/*public String GetAuthor()// forced to implement 
	{
		return null;			// Re factored code doesn't need this method here 
	}
*/
	public String GetTitle()
	{
		return "Solo: A Star Wars Story";
	}

	public boolean IsDigitalOnly()// this is Digital Item, so return true 
	{
		//return false;
		return true;
	}

	public ArrayList<String> GetCastList()
	{
		ArrayList<String> cast = new ArrayList<String>();
		cast.add("Alden Ehrenreich");
		cast.add("Joonas Suotamo");
		cast.add("Woody Harrelson");
		cast.add("Emilia Clarke");
		cast.add("Donald Glover");
		cast.add("Thandie Newton");
		cast.add("Paul Bettany");
		return cast;
	}
}