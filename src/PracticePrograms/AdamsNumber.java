package PracticePrograms;

public class AdamsNumber {

	public int ReverseNumber(int i) 
	{
		// TODO Auto-generated method stub
		return 0;
	}


		public static void main(String[] args) 
		{
			
	  AdamsNumber an = new AdamsNumber();
	   int i,n , rn;
	   int sn, rsn, rrsn;
	   System.out.println("list of AdamsNumber till 1000");
	   
	   for(i=10; i<= 1000;i++)
	   {
		   n=i;
		   rn = an.ReverseNumber(i);
		   if(n==rn)
			   continue;
		   sn = n*n;
		   rsn=rn*rn;
		   rrsn=an.ReverseNumber(rsn);
		   if(rrsn==sn)
		   { System.out.println();
		   
		   }
	   }
		

		}	

}