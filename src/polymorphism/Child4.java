package polymorphism;

public class Child4 extends Parent {

	
	public static void marry2() {
		System.out.println("Child Want to Marry Simran");
	}
	
	public static void main(String[] args) {
	
	
	Parent p2=new Parent();
	//Method resolution responsibilty-JVM
	
			p2.marry2();//Will get the compile time error
			
	
	}
}
