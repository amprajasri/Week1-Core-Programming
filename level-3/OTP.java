import java.util.Scanner;
import java.lang.Math;
public class OTP
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int otps[]=OTPArray();
		for(int i:otps)
		{
			System.out.println(i);
		}
		boolean isUnique=checking(otps);
		System.out.println("are unique:"+isUnique);
	}
	public static int OTPgenaration()
	{
	  return 100000+(int)(Math.random()*900000);
	}
	public static int[] OTPArray()
	{
		int otps[]=new int[10];
		for(int i=0;i<10;i++)
		{
				otps[i]=OTPgenaration();
		}
		return otps;
	}
	public static boolean checking(int opts[])
	{
			for(int i=0;i<10;i++)
			{
				for(int j=i+1;j<10;j++)
				{
				  if(opts[i]==opts[j]) return false;					  
				}
				
			}
			return true;
	}
	
	
}