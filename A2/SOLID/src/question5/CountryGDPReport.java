package question5;





public class CountryGDPReport//
{

	
	

	public void PrintCountryGDPReport(GetGDPofDifferentSectors countries)
	{
		
		System.out.println("GDP By Country: ");
		System.out.println("Country    AgricultureGDP    TourismGDP    Manufacturing\n");
		System.out.println(countries.getAllGDP()+"\n");
		
	
	}
	
}