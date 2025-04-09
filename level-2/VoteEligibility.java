import java.util.Scanner;
import java.lang.Math;
public class VoteEligibility
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int ages[]=getAges();
		System.out.println("ages:");
		for(int i:ages)
		System.out.println(i);
	    String info[][]=getVodeDate(ages);
		display(info);
	}
	public static int[] getAges()
	{ 
		int ages[]=new int[10];
		for(int i=0;i<10;i++)
		{
			ages[i]=10+(int)(Math.random()*90);
		}
		return ages;
	}
	
	public static String[][] getVodeDate(int ages[])
	{
		String data[][]=new String[10][2]; 
		for(int i=0;i<10;i++)
		{
			if(ages[i]<18) 
			{
				data[i][0]=String.valueOf(ages[i]);
				data[i][1]="invalid";
			}
			if(ages[i]>18) 
			{
				data[i][0]=String.valueOf(ages[i]);
				data[i][1]="valid";
			}
		}
		return data;
	}
	public static void display(String data[][])
	{
		System.out.println("age\tStatus");
		for(int i=0;i<10;i++)
		{
			System.out.println("--------------------");
			System.out.println(data[i][0]+"\t"+data[i][1]);
		}
	}

	
}