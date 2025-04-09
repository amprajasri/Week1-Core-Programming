import java.util.Scanner;
import java.util.Random;
public class FindingTallestShortest
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Random randon=new Random();
		int heights[]=new int[11];
		for(int i=0;i<11;i++)
		{
			heights[i]=randon.nextInt(101)+150;
		}
		int sum=totalHeight(heights);
		float mean=meanOfHeights(heights);
		int shortest=shortestHeight(heights);
		int tallest=tallestHeight(heights);
		System.out.println("all player heights:");
		for(int i=0;i<11;i++)
		{
			System.out.println(heights[i]);
		}
		System.out.println("sum: "+sum);
		System.out.println("mean: "+mean);
		System.out.println("tallest: "+shortest);
		System.out.println("shortest: "+tallest);
	}
	public static int totalHeight(int heights[])
	{
		int sum=0;
		for(int i=0;i<heights.length;i++)
		{
			sum+=heights[i];
		}
		return sum;
	}
	public static float meanOfHeights(int heights[])
	{
		int sum=0;
		for(int i=0;i<heights.length;i++)
		{
			sum+=heights[i];
		}
		return (float)sum/heights.length;
	}
	public static int tallestHeight(int heights[])
	{
		int max=heights[0];
		for(int i=0;i<heights.length;i++)
		{
			if(max<heights[i]) max=heights[i];
		}
		return max;
	}
	public static int shortestHeight(int heights[])
	{
		int min=heights[0];
		for(int i=0;i<heights.length;i++)
		{
			if(min>heights[i]) min=heights[i];
		}
		return min;
	}

	
}