package question5;

public class DriverClass { // to test the code
	
	
	public static void main(String args[]){
		
		
		// get the gdp of any country you need 
		 
		
		CountryGDPReport gdp=new CountryGDPReport();
		
		gdp.PrintCountryGDPReport(new Canada());
		gdp.PrintCountryGDPReport(new Mexico());

	}

}
