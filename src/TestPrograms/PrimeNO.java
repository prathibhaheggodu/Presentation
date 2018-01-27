package TestPrograms;

import java.util.Scanner;

public class PrimeNO

{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prime number");
		int num = sc.nextInt();
        
		boolean flag = false;
		for (int i = 2; i < num / 2; i++)
		{
			if (num % i == 0) 
			{
				flag = true;
				break;
			}}
			if (flag)
			{
				System.out.println(" NUMBER IS NOT A PRIME");
			}
			else 
			{
				System.out.println("Number is a prime");
			}
			
			sc.close();

		}

	}

