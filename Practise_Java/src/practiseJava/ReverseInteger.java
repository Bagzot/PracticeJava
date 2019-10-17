package practiseJava;

public class ReverseInteger {

	public static void main(String[] args) {

		// 1. using algo
		long num = 1234568565;
		long reverse = 0;

		while (num != 0) {

			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(reverse);
		
		
		// 2. using StringBuffer method 
		
		long num1 = 987654321;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		

	}

}
