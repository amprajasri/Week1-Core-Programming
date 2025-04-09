import java.util.Scanner;
import java.lang.Math;
public class RandonNumbers
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int numbers[]=generate4DigitRandomArray(size);
		double result[]=findAverageMinMax(numbers);
		System.out.println("generated numbers:");
		for(int i=0;i<size;i++) System.out.println(numbers[i]);
		System.out.println("average: "+result[0]);
		System.out.println("minimun: "+result[1]);
		System.out.println("maximum: "+result[2]);
	}
	public static int[] generate4DigitRandomArray(int size)
	{
		int numbers[]=new int[size];
		for(int i=0;i<size;i++)
		{
			numbers[i]=1000+(int)(Math.random()*9000);
		}
		return numbers;
	}
	public static double[] findAverageMinMax(int numbers[])
	{
			double result[]=new double[3];
			double sum=0.0;
            int min=numbers[0];
			int max=numbers[0];
			for(int i=0;i<numbers.length;i++)
			{
						sum+=numbers[i];
			}
			result[0]=sum/numbers.length;
			for(int i=0;i<numbers.length;i++)
			{
			min=Math.min(min,numbers[i]);
			max=Math.max(max,numbers[i]);
			}
			result[1]=min;
			result[2]=max;
			return result;
	}
}