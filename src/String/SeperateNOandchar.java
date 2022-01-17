package String;

public class SeperateNOandchar {

	public static void main(String[] args) {
		
		
		//Declare the string using literals
		
		String place="Pu2323nem32323umbai";
		
		String numbers="";
		String chars="";
		
	for(int i=0; i<=place.length()-1; i++)  {
		
		if (Character.isDigit(place.charAt(i))) {
			
			
			numbers=numbers+(place.charAt(i));
			
		}
		else {
			chars=chars+place.charAt(i);
		}
	  }
	
		System.out.println(numbers);
	System.out.println(chars);

	
	
	}

}
