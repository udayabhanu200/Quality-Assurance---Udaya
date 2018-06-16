package question6;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class StoreAndGetLedger {
	
	
	
	public static void Save(CurrencyCoinsDeposit CC)
	{
		try
		{
			PrintWriter writer = new PrintWriter("piggybank.txt", "UTF-8");
			writer.println(Integer.toString(CC.CheckPenny()));
			writer.println(Integer.toString(CC.CheckDime()));
			writer.println(Integer.toString(CC.CheckNickel()));
			writer.println(Integer.toString(CC.CheckQuarter()));
			writer.close();
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}

	public static void Load(CurrencyCoinsDeposit CC)
	{
		try
		{
			Scanner in = new Scanner(new FileReader("piggybank.txt"));
System.out.print("\n Pennies: " + Integer.parseInt(in.next())+ "\n Dimes: "+
			Integer.parseInt(in.next()) + 
			"\n Nickels: " +Integer.parseInt(in.next())+
					"\n Quarters: "+ Integer.parseInt(in.next()) );
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}
}
