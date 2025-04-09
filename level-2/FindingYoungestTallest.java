import java.util.Scanner;
public class FindingYoungestTallest
{
	
	public static void main(String[] args)
	{   Scanner input=new Scanner(System.in);
		int heights[]=new int[3];
		int age[]=new int[3];
		String names[]={"Amar","Akbar","Anthony"};
		
		for(int i=0;i<3;i++)
		{
			heights[i]=input.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			age[i]=input.nextInt();
		}
		int ageIndex=findingYoungest(age);
		int heightIndex=findingTallest(heights);
		System.out.println(names[heightIndex]+" is the tallest");	
		System.out.println(names[ageIndex]+" is the youngest");	
		
	}
	public static int findingYoungest(int age[] )
	{
		int minAge=age[0];
		int ageIndex=0;
		for(int i=0;i<3;i++)
		{
			if(minAge>age[i])
			{
				minAge=age[i];
				ageIndex=i;
			}
		}
		return ageIndex;
	}
	public static int findingTallest(int heights[] )
	{
		int maxHeight=heights[0];
		int heightIndex=0;
		
		for(int i=0;i<3;i++)
		{
			if(maxHeight<heights[i])
			{
				maxHeight=heights[i];
				heightIndex=i;
			}
		}
		return heightIndex;
	}
}