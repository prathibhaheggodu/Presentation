package TestPrograms1;

public class Fibonacci {
	public static void main(String[] args)

	{
		int n1 = 0, n2 = 1, n3 = 0;
		System.out.println(n1 + "" + n3);
		while (n1 + n2 < 100) {
			n3 = n1 + n2;
			System.out.println("" + n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
