public class Test 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[] { 50, 99, 55, 66, 72, 90, 10, 15, 6, 27 };

		int min = arr[0]; //  assume first elements as smallest number
		int max = arr[0]; //  assume first elements as largest number

		for (int i = 1; i < arr.length; i++)  // iterate for loop from arrays 1st index (second element)
		{
			if (arr[i] > max) 
			{
				max = arr[i];
			}
			if (arr[i] < min) 
			{
				min = arr[i];
			}
		}

		System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);
	}

}