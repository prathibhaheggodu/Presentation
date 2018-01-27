package Patterns;

public class Pattern7 {

	
	public static void main(String[] args)
	
	{ int i,j; int n=10;// size
	
	for(i=0;i<=10;i++)
		
	{ for(j=0;j<=10;j++)
		
	{ if((i==0||j==0)||i==j||j==n||i+j==n-1||j==10)
		
	{ System.out.print("*");
	   
	}
	  
	else 
		
	{ System.out.print(" ");

	}
	
	}
	
	System.out.println("");
	}
	}}
	
	
	


