package inheritance;

public class inheritance_Constructor extends parents2 {
	
	
int x=23;
	
	public inheritance_Constructor () {
		super(10);
		System.out.println("inheritance constructor");
		System.out.println("parents2 x : " + super.x);
	}
	public inheritance_Constructor (int a) {
		this();
		System.out.println("inheritance constructor");
		System.out.println("inheritance_Constructor : " + this.x);
	}
   
	
	public static void main(String[] args) {
		
		inheritance_Constructor c1=new inheritance_Constructor(10);
		
		
	}
	
	
	

}
