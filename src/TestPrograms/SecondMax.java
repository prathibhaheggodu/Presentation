package TestPrograms;

public class SecondMax {
public static void main(String[] args)
{ int arr[]= {10,50,20,30,60,80,90};
  int largest=arr[0];
  int secMax=arr[1];
  
  
  // to get the array data
for(int i=0;i<arr.length;i++ )
{ System.out.println(arr[i]);
  
}
 
 // to get the second max

{ for(int i=0;i<arr.length;i++)
       { if(arr[i]>largest)
          { 
            secMax=largest;
            largest=arr[i];
          }
       }
}

System.out.println("The first maximum is="+largest);
System.out.println("Thes second maximum number is="+secMax);

  
}

}
