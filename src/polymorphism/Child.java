package polymorphism;

public class Child extends Parent {
	
/*
 * Rule-

1) name and argument type must  be macthed of betweeb classes. Signature must be same.

2) There will be inheritance using extends keyword between the classes.

3) Parent class private method not avaialable to child class hence overriding concept not applicable for private method.
*/	
	
	
	
	//Overriding method
	public void marry() {
		System.out.println("Child Want to Marry to Raveena");
	}
 
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1-Parent Reference and parent object
	
		Parent p=new Parent();
	
		//Parent Specific	
	     p.marry();
	
	//2-Creating child refrence and child object
		Child c=new Child();
		
		//Child Specific
		c.marry();
		
	//3 -Creating parent refrence and child object
		
		
		//Run time polymorphism or 
		Parent p1=new Child();
		
		//Method resolution responsibilty-JVM-
		p1.marry();
		
	}
		
	}
