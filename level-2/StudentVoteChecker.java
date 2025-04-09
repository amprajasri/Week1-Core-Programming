import java.util.Scanner;
public class StudentVoteChecker
{
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int ages[]=new int[10];
		boolean flag;
		for(int i=0;i<10;i++)
		{
			ages[i]=input.nextInt();
			flag=canStudentVote(ages[i]);
			if(flag) System.out.println("student can vote");
			else System.out.println("student can not vote");
		}
	}
	public static boolean canStudentVote(int age)
	{
			if(age<18) return false;
			else return true;
	}
	
}