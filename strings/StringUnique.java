import java.util.Scanner;
public class StringUnique
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int length=count(str);
		char unique[]=getUnique(str);
		for(char i:unique)
			System.out.println(i);
	}
	
	public static int count(String str )
	{
		int i=0;
		char ch;
		try{
		while(true)
		{
			ch=str.charAt(i);
			i++;
		}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			return i;
		}
	}

	public static char[] getUnique(String str)
	{
		int l=count(str);
		boolean exists=false;
		char letters[]=new char[l];
		int index=0;
		for(int i=0;i<l;i++)
		{	if(i!=0)
	
        	{
			  for(int j=i-1;j>=0;j--)
			  {
				if(str.charAt(i)==str.charAt(j)) exists=true; 
			  }
			}
         	if(!exists)
			{
				letters[index]=str.charAt(i);
				index++;
				
			}
			exists=false;
		}
		char result[]=new char[index];
		for(int i=0;i<index;i++)
		{
			result[i]=letters[i];
		}
		
		return result; 
		
	}
}