package exceptionhandling;

public class Test1 {
	
	public static void main(String[] args) {
		
		   
		System.out.println("Start Statement ");
		
		
		
		try 
		{
			String s=null;
			if (s.equals("Pune"))
				System.out.println(s);
			
			
		System.out.println("Risky code");
		
		}
		catch (NullPointerException e) {
		 System.out.println("Catch block " + e.getMessage());	
		}
		
		finally
		{
			System.out.println("Clean up code");
		}
		
		System.out.println("End statement ");
		
		
		
		System.out.println("*************************************************************");
		
		System.out.println("Start Statement ");
		try 
		{
			System.out.println(10/0);
		System.out.println("Risky code");
		
		}
		
		catch (ArithmeticException e) {
			 System.out.println("Catch block " + e.getMessage());	
			}
		
		
		catch (NullPointerException e) {
			 System.out.println("Catch block " + e.getMessage());	
			}
		
		
		
		catch (RuntimeException e) {
			 System.out.println("Catch block " + e.getMessage());	
			}
		
		catch (Exception e) {
			 System.out.println("Catch block " + e.getMessage());	
			}
		
		
		
		finally
		{
			System.out.println("Clean up code");
		}

		
		
		System.out.println("End statement ");
		
	}


}
