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
			String grade[][]=getGrades(totAvgPercent);
			display(totAvgPercent,grade);
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
	
	public static String[][] getGrades(int info[][])
	{
		String grades[][]=new String[info.length][2];
		for(int i=0;i<info.length;i++){
		    grades[i][0]=String.valueOf(info[i][0]);
			if(info[i][2]>=80){
					grades[i][1]="A" ;
				}
			else if(info[i][2]>=70){
				grades[i][1]="B";
				}
				else if (info[i][2]>=60){
					grades[i][1]="C";
				}
				else if(info[i][2]>=50){
					grades[i][1]="D";
					}
				else if(info[i][2]>=40){
				grades[i][1]="E";
					}
				else{
				grades[i][1]="R";
				}
		}
		return grades;
	}
	
	
	public static void display(int totAvgPercent[][],String grade[][])
	{
			System.out.printf("total Marks\ttotal average\ttotal percent\tGrade");
			System.out.println();
			for(int i=0;i<totAvgPercent.length;i++)
			{
				 System.out.println("----------------------------------------------------------------------------------");
				 System.out.printf("%d\t\t%d\t\t%d\t\t%s\n",totAvgPercent[i][0],totAvgPercent[i][1],totAvgPercent[i][2],grade[i][1]);
				 
			}
			
	}
	
}
	
	
	
