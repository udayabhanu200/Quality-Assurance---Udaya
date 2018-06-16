package question5;

public  class Mexico implements GetGDPofDifferentSectors
{
	String country="Mexico";
	
	
	public String getAgriculture()
	{
		return "$50000000 MXN";
	}

	public String getTourism()
	{
		return "$100000 MXN";
	}
	
	public String getCountryName(){
		
		return country;
		
		
	}
	
	public String getAllGDP(){
		return getCountryName()+"    "+getAgriculture()+"     "+getTourism();
		// return or write it to the file
	}
}