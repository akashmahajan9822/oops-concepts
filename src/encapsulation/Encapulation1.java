package encapsulation;

public class Encapulation1 {


	//data Hiding using private modifier
	
		private  double balance=1000;    // instance private variable
		
		
		//// instance public method
		public double getBalance(int accNo) {
			
			return this.balance;   
		}
		
		// write update balance 
		public void setBalance(double amount ) {
			
			this.balance+=amount;  //add balance
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
		}

	
	
}
