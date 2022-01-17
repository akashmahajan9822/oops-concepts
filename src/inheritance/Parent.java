
package inheritance;


/*It can be defined as the scope of parent class can be extends to the child class by the help of 'extends' keyword.

Is a relationship-

When we are inheriting super class into subclass using extends keyword then that type of relationship- is known as

'Is a relationship'.

 * */





public class Parent   extends GrandParent{
	
	
	
	
	
	
	
public void property() {
		
		System.out.println("Parent Property");
		
	}
     public void land() {
		
		System.out.println("Parent land");
		
	}
	public static void main(String[] args) {
	
		Parent p=new Parent();
		p.property();
		p.land();
        p.grandParentProprty();
	}

	
	
	
	
	
	
	
	
	
	
	
}
