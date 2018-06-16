package question5;

public  class Canada implements GetGDPofDifferentSectors
{
	String country="Canada";
	
	
	public String getAgriculture()
	{
		return "$50000000 CAD";
	}

	public String getManufacturing()
	{
		return "$100000 CAD";
	}
	
	public String getCountryName(){
		
		return country;
		
		
	}
	
public String getAllGDP(){
	
	return getCountryName()+"    "+getAgriculture()+"                     "+getManufacturing();
		
	}
	
}