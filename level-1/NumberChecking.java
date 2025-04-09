import java.util.Scanner;
public class NumberChecking
{
public static void main(String[] args)
{
 Scanner input=new Scanner(System.in);
	int numbers[]=new int[5];
	for(int i=0;i<5;i++)
	{
	 numbers[i]=input.nextInt();
	
	}
	for(int i=0;i<numbers.length;i++)
	{
		if(numbers[i]>0){
		 if(numbers[i]%2==0) System.out.println("positive even");
		 else System.out.println("positive odd");
		}
		else if(numbers[i]<0) System.out.println("negative");
		else System.out.println("zero");
	}

  if(numbers[0]<numbers[numbers.length-1]){
	  System.out.println("first less than last");
  }
  else if(numbers[0]>numbers[numbers.length-1]){
	  System.out.println("first greater than last");
  }
  else{
   System.out.println("first equal to last");
  }
}
 }
 
 
  
 




