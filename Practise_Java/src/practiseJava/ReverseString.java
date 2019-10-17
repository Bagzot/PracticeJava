package practiseJava;

public class ReverseString {

	public static void main(String[] args) {
		
		//Reverse a string 
		//difference between String AND StringBuffer
		//do we have Reverse function in String?  no

		String s = "I love Marziye";
		String s1 = "I love java coding";
		String reverse = "";
	
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}

		System.out.println("Reverse string is: " + reverse);

	 
	    StringBuffer sf = new StringBuffer(s1);	    
	    System.out.println(sf.reverse());	    
	    System.out.println(sf.capacity());
	    
	}	    
}