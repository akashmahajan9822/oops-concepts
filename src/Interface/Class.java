package Interface;

public class Class implements Interface1 ,Interface2 {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class object=new Class();
		object.googlemap();
		object.method3();
		object.method4();
		object.isromap();
		System.out.println(Interface1.x);  // static variable
		


	}
	
	

	
	
	
	@Override
	public void googlemap() {
		System.out.println("food delivary");
		
	}

	@Override
	public void isromap() {
		// TODO Auto-generated method stub
		System.out.println("food delrivary");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void method6() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void method7() {
		// TODO Auto-generated method stub
		
	}
	
	

}
