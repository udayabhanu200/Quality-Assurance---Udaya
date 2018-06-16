package question3;

public class DriverClass {

	
	
	public static void main (String args[]){
		
		
		//ProfitReport pr= new ProfitReport();
		
		EmailSender.SendToEmail("bhanu.l@gmail.com", "ProfitReport",new ProfitReport().CreateReport());
		
	}
}
