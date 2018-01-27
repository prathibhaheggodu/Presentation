package TestPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args)
	{ int n1=0,n2=1,n3=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=sc.nextInt();
	  System.out.println("Fibonacci series of given number is:");
	  while(n1+n2<num)
	  { n3=n1+n2;
	    System.out.print(" "+n3);
	    n1=n2;n2=n3;
	  }
	  System.out.println();
	  sc.close();
	}

}
