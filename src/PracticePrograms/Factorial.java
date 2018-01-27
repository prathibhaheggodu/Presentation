package PracticePrograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =5;
int fact=1;
System.out.println("factorial of" + num);

for(int i=1;i<=num;i++)
{
	fact= fact*i;
}
System.out.println(fact);
	}

}
