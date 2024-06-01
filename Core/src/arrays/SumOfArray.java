package arrays;

public class SumOfArray
{
	public void getSum() {
		int sum=0;
		int arr[] = {1, 1, 1, 1, 1};
		for(int i=0; i<arr.length; i++) {
			sum = arr[i]+sum;
		}
		System.out.println("The sum of the array is: " + sum);
	}

	public static void main(String[] args) {
		SumOfArray sum = new SumOfArray();
		sum.getSum();
	}
}