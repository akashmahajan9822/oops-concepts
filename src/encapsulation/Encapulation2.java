package encapsulation;

public class Encapulation2 {
	
	
	Encapulation1 en; // define en with reference to Encapulation1 class // provide accsess for whole class 
	
	public Encapulation2() {
		en=new Encapulation1(); // create object en  and initialized with construction initialization
		}
// by using above concept en object created for whole class 
// no need to create seperate object for eache method	 
	
	
	// write acco no
	public void returnData(int accNo) {
		
		System.out.println(en.getBalance(accNo)); // print getBalance method output
		
	}

	// write balance update or new transaction
	public void setData(double  updateBalance) {
	
		en.setBalance(updateBalance);
		
	}

	public static void main(String[] args) {
		
		
		Encapulation2 en2=new Encapulation2();
		
		
		en2.returnData(123456);  // enter account no and get balance
		en2.setData(2343.56); // write balance update or new transaction
		en2.returnData(123456);

	}

}
