package practiseJava;

public class MaxNum {

	public static void main(String[] args) {
		
	
		int arr[] = {2,5,58,9,10,-3,50};
		int max= arr[0];
		
		for(int i = 1; i <arr.length; i++) 
			if(arr[i] > max )
			max = arr[i];
	
		System.out.println("Max num is :" + max);
				
}
}

