import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class Grading
{
	public static void main(String[] args)
	{
			Scanner input=new Scanner(System.in);
			int n=input.nextInt();
			int PMC[][]=getScores(n);
			int totAvgPercent[][]=calculations(PMC,n);
			display(totAvgPercent,n);
	}
    public static int[][] getScores(int n)
	{
		int PMC[][]=new int[n][3];
		for(int i=0;i<n;i++)
		{
			PMC[i][0]=10+(int)(Math.random()*90);
			PMC[i][1]=10+(int)(Math.random()*90);
			PMC[i][2]=10+(int)(Math.random()*90);
		}
		return PMC;
	}
	public static int[][] calculations(int PMC[][],int n)
	{
		int totAvgPercent[][]=new int[n][3];
		for(int i=0;i<n;i++)
		{
			totAvgPercent[i][0]=PMC[i][0]+PMC[i][1]+PMC[i][2];
			totAvgPercent[i][1]=Math.round(totAvgPercent[i][0]/3);
			totAvgPercent[i][2]=Math.round(totAvgPercent[i][0]/3);
		}
		return totAvgPercent;
	}
	public static void display(int totAvgPercent[][],int n)
	{
			System.out.printf("total Marks\ttotal average\ttotal percent");
			System.out.println();
			for(int i=0;i<n;i++)
			{
				 System.out.println("-----------------------------------------------------------------");
				 System.out.printf("%d\t\t%d\t\t%d\t\t\n",totAvgPercent[i][0],totAvgPercent[i][1],totAvgPercent[i][2]);
				 
			}
			
	}
	
}
	
	
	
