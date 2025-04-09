import java.util.Scanner;
public class FindingYoungestTallest
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int heights[]=new int[3];
		int age[]=new int[3];
		int minAge,maxHeight;
		String names[]={"Amar","Akbar","Anthony"};
		int heightIndex=-1;
		int ageIndex=-1;
		for(int i=0;i<3;i++)
		{
			heights[i]=input.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			age[i]=input.nextInt();
		}
		maxHeight=heights[0];
		minAge=age[0];
		
		for(int i=0;i<3;i++)
		{
			if(maxHeight<heights[i])
			{
				maxHeight=heights[i];
				heightIndex=i;
			}
		}
		for(int i=0;i<3;i++)
		{
			if(minAge>age[i])
			{
				minAge=age[i];
				ageIndex=i;
			}
		}
		
		System.out.println(names[heightIndex]+" is the tallest");	
		System.out.println(names[ageIndex]+" is the youngest");	


	}
}