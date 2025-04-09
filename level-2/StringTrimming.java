import java.util.Scanner;
import java.lang.Integer;
public class StringTrimming
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String substr1=trimming(str);
		System.out.println(substr1);
		String substr2=str.trim();
		System.out.println(substr2);
		System.out.println("both are same:"+substr1.equals(substr2));
		
		
	}
	public static int[] trimIndex(String str)
	{ 
		
		int arr[]=new int[2];
		int start=0,end=0;
		for(int i=0;i<str.length();i++)
		{
		   if(str.charAt(i)!=' ') 
		   {
			   start=i;
			   break;
		   }
		   
		}
		for(int i=str.length()-1;i>start;i--)
		{
		   if(str.charAt(i)!=' ') 
		   {
			   end=i+1;
			   break;
		   } 

		   
		}
		if(end==0) end=str.length(); 	  
		return new int[] {start,end};	
		
	}
	public static String trimming(String str)
	{ 
		int index[]=trimIndex(str);
		String result="";
		for(int i=index[0];i<index[1];i++)
		{
			result+=str.charAt(i);
		}
		return result;
	}
	
	
}