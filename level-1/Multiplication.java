import java.util.Scanner;
public class Multiplication
{
	public static void main(String[] args)
		{
			Scanner input=new Scanner(System.in);
			int n=input.nextInt();
			int result[]=new int[11];
			for(int i=1;i<=10;i++)
			{
			  result[i]= i*n;
			   System.out.println(n+" x "+i+"="+result[i]);
			  
			}
			
		}
}
 
 
  
 




