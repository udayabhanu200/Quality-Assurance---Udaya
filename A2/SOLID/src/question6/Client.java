package question6;


public class Client {
// Driver Class , to test 
	public static void main (String args[]){
		
		CurrencyCoinsDeposit cc= new PiggyBank();
	     cc.AddPenny();
		StoreAndGetLedger.Save(cc); // perform save after every add 
			 
			cc.AddDime();
			StoreAndGetLedger.Save(cc);// perform save after every add
		
			 
		 	cc.AddNickel();
			StoreAndGetLedger.Save(cc); // perform save after every add 
			
		
		 cc.AddQuarter();
			StoreAndGetLedger.Save(cc); // perform save after every add
			
		 StoreAndGetLedger.Load(cc);
			
			
			
		}
		
		
		
	
		
		
		
	}
	
	

