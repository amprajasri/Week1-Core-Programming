import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class BonusCalculations
{
	public static void main(String[] args)
	{
		int personData[][]=getSalaryService();
		double newPersonData[][]=getBonusNewSal(personData);
		System.out.println("old salary and service years");
		for(int i=0;i<10;i++)
		{
			System.out.println(personData[i][0]+" and "+personData[i][1]);
		}
		System.out.println("bonus and new salary");
		for(int i=0;i<10;i++)
		{
			System.out.println(newPersonData[i][0]+" and "+newPersonData[i][1]);
		}
		displayInfo(personData,newPersonData);
	}
	public static int[][] getSalaryService()
	{
		Random rand=new Random();
		int personData[][]=new int[10][2];
		for(int i=0;i<10;i++)
		{
			personData[i][0]=10000+(int)(Math.random()*90000);
			personData[i][1]=rand.nextInt(15)+1;
		}
		return personData;
	}
	public static double[][] getBonusNewSal(int personData[][])
	{
			double bonusNewSal[][]=new double[10][2];
			for(int i=0;i<10;i++)
			{
				if(personData[i][1]>5)
				{
					bonusNewSal[i][0]=personData[i][0]*(5.0/100);
   
				}
				else
				{
					bonusNewSal[i][0]=personData[i][0]*(2.0/100);
				}
					bonusNewSal[i][1]=personData[i][0]+bonusNewSal[i][0];
			}	
			return bonusNewSal;
	}
	public static void displayInfo(int personData[][],double bonusNewSal[][])
	{
		double totalBonus=0.0,totalOldSalary=0.0,totalNewSalary=0.0;
		for(int i=0;i<10;i++)
		{
			totalNewSalary+=bonusNewSal[i][1];
			totalOldSalary+=personData[i][0];
			totalBonus+=bonusNewSal[i][0];
		}
		System.out.println("Old Salary\tNew Salary\tTotal Bonus");
    System.out.println("-----------------------------------------------------------------");
    System.out.printf("%.2f\t%.2f\t%.2f%n", totalOldSalary, totalNewSalary, totalBonus);
	}
	
	
	
}