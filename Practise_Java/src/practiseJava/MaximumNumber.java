package practiseJava;


public class MaximumNumber {

	static int arr[] = { -5, 6, 12, -56, 22, 45, 15 };

	public static  int largestNumber() {

		int x;
		int max = arr[0];
		for (x = 1; x < arr.length; x++)
			if (arr[x] > max)
				max = arr[x];
		return max;

	}

	public static void main(String[] args) {

		System.out.println("Maximun Number Is : " + largestNumber());
	}
}