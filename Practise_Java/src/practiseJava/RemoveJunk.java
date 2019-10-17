package practiseJava;

public class RemoveJunk {

	public static void main(String[] args) {
		
		
		// Regular expression [^a-zA-Z0-9]
		
		String s = "复活节阿拉山口的划分空间里  i will try 货到付款计划放到空间 @#%￥&#×@" ;
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		

	}}


