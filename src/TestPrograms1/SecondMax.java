package TestPrograms1;

public class SecondMax {
	public static void main(String[] args)

	{
		int arr[] = { 40, 10, 50, 60, 20 };
		int largest = arr[0]; // declare and initialization
		int secondMax = arr[1]; // declare and initialization

		System.out.println("The given array is : ");
		for (int i = 0; i < arr.length; i++) // to print the array data
		{
			System.out.println(arr[i] + "\t");
		}

		for (int i = 0; i < arr.length; i++)
		// if the number is grreater than the largest,
		// assigns the number to largest
		{
			if (arr[i] > largest) {
				secondMax = largest;
				{
					largest = arr[i];
				}
			}
		}
		System.out.println("The second Max number is= " + secondMax);
	}
}