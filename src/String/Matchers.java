package String;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matchers {

	public static void main(String[] args) {
	
		
		String pattern="abc";
		String s="abc2egdabcsdabchg2abc";
		
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(s);
		int count=0;
		
		while(m.find()) {
			count++;
			System.out.println("Pattern is avaialble at : " + m.start() + " Index");
			
			
		}
		System.out.println(count);

	}

}
