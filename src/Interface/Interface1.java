package Interface;

public interface Interface1 extends Interface3{
	
	/* rules1. variables are public ,static ,final. 
	 * 2. method are public abstract  by default. method can not be static show compile time error
	 * 3.we can not write in method. method dont have body.
	 * 3.multiple inheritance achieved.
	 * 4. we can not create object for interface.
	 * 5.constructor not support.
	 *6.interface extend another interface
	 * */
	
	public static int x=10;
	
	
//we can mention method by both way 
//and both are abstract and public and static
	
	 void googlemap();
	public abstract void isromap();
	//void method3();



}
