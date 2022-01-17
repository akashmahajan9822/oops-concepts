package polymorphism;

public class Child2 {
	
	//Method Overloading
		public void behaviour()  {
			
			
			System.out.println("bahaviour with Family");
		}
		
		public void behaviour(int x)  {
			
			System.out.println("bahaviour with Friends");
		}
		public void behaviour(String s)  {
			System.out.println("bahaviour as Student ");
		}
		
		public static void main(String[] args) {
			
			Child2 c=new Child2();	
			
			c.behaviour(10);
			c.behaviour();
			c.behaviour("akash");
			
			
		}

}
