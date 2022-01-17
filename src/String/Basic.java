package String;

public class Basic {
	
	public static void main(String[] args) { 
		 
		 //object creation of string 
		 //1. without using new keyword
		 String aa="xyz"; 
		 
		 //2. using new keyword
		 String bb=new String("xyz"); 
		 
		 
		 
		//without using new keyword ---> constant pool area 
		 String s1="abc"; 
		 String s2="abc"; 
		 String s3="abc1"; 
		 
		// using new keyword---> non-constant pool area 
		 String s4=new String("abc"); 
		 String s5=new String("abc"); 
		 
		 System.out.println(s1==s2); //true
		 System.out.println(s1==s3); //false
		 System.out.println(s1==s4); // false
		 System.out.println(s4==s5); //false
		 
		 
		 } 
}
