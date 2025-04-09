import java.util.Scanner;
public class ArraySumming
{
	public static void main(String[] args)
		{
			Scanner input=new Scanner(System.in);
			double numbers[]=new double[10];
			int i=0;
			double temp=-1.0;
			double sum=0.0;
			while(true){
			 temp=input.nextDouble();
			 if(temp==0 || i>=10) break;
			 numbers[i]=temp;
			 i++;
			}
			for(int j=0;j<numbers.length;j++){
			 sum+=numbers[j];
			}
			System.out.println(sum);
		}
}
 
 
  
 




