package question4;

public class Client {
	
	
	
	public static void main (String args[]){
		
		USDollarAccount USD =new USDollarAccount();
		
		USD.Credit(100.00f);
		
		System.out.println(USD.GetBalance());
	}

}
