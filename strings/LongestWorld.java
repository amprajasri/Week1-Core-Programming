import java.util.Scanner;
public class LongestWorld
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String arr[]=str.split(" ");
		int longest=arr[0].length();
		String longestWord=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(longest<arr[i].length()) 
			{
				longest=arr[i].length();
				longestWord=arr[i];
			}
		}
		System.out.println(longestWord);
		
	}
	
}