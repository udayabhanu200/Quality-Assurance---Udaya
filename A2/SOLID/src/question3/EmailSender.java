package question3;

import java.util.ArrayList;

public class EmailSender
{

	
	
												
	
	public static void SendToEmail(String emailAddress,String subject, ArrayList<String> reportData )
	{
		try
		{
			StringBuilder builder = new StringBuilder();
	    	for (int i = 0; i < reportData.size(); i++)
	    	{
	    		builder.append(reportData.get(i) + "\n");
	    	}
	    	
	    	
	    	System.out.println("To: " + emailAddress);
			System.out.println("Subject: " + subject);
			System.out.println("Message: \n\n" + builder.toString());
	    	
	    	
	    	//SendEmail(emailAddress, "Profit Report!", builder.toString());
		}
		catch (Exception e)
		{
			System.out.println("Yipes internet must be down!");
		}
	}
}