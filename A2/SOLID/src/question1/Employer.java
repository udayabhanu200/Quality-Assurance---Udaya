package question1;

import java.util.ArrayList;

public class Employer
{
	ArrayList<Worker> Workers;// Global 
	

	public Employer()
	{
		Workers = new ArrayList<Worker>(); // creating Super type "Worker" to store any type of worker into the array
		
		// adding all HourlyWorks to the array
		for (int i = 0; i < 5; i++)
		{
			Workers.add(new HourlyWorker());
		}
		
		//adding all the Salary workers to the same array  
		
		for (int i = 0; i < 5; i++)
		{
			Workers.add(new SalaryWorker());
		}
	}

	public void outputWageCostsForAllStaff(int hours)
	{
		float cost = 0.0f;
		for (int i = 0; i < Workers.size(); i++)
		{
									
			cost += Workers.get(i).calculatePay(hours);
		}
		
		System.out.println("Total wage cost for all staff = $" + cost);
	}
}