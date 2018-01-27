package Patterns;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args)

	{  Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the no of rows");
	int row,space,star;
	
	int norows=sc.nextInt();
	
	for(row=1;row<=norows;row++)
	{ for(space=1;space<=norows-row;space++)
		
	{System.out.print(" ");
	
	}
	
	for(star=1;star<=(row*2)-1;star++)
    { System.out.print("*");
	}

     System.out.println();
}
  for(row=norows-1;row>=1;row--)
  {  for(space=1;space<=norows-row;space++)
	  
  {System.out.print(" ");
  }
  for(star=1;star<=(row*2)-1;star++)
  {System.out.print("*");
  }
  System.out.println();
  
  }sc.close();
  }}
 
 