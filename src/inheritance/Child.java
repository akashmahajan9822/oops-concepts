package inheritance;

/*
 * When we  are referring to the perticular functionality then we have to go for Has type of relationship.
Thre is no specific keyword injava to achieve this relationship.
To achieve  Has a relationship-we will require to create the object of the same class directly.
*/



public class Child extends Parent{
	
	public void childProperty() {
		
		System.out.println("Child Property");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.property();
		c.land();
		c.childProperty();
		c.grandParentProprty();
		
		//Has a relationship
				Student s=new Student();
				s.playing();
				
		
	}	
		
	}
