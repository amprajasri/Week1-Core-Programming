import java.util.Scanner;
import java.lang.Math;
public class RockPaperScissor
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int games=input.nextInt();
		input.nextLine();
		String user,computer;
		int userWin=0;
		int i=0;
		while(i<games)
		{
			System.out.print("user turn:");
			user=input.nextLine();
			computer=play();
			System.out.println("computer turn:"+computer);
			if(user.equals(computer)) continue;
			if(winingCheck(user,computer)) userWin++;
			i++;
			
		}
		double percentAvg[][]=getWinning(userWin,games);
		display(percentAvg);
		System.out.println(userWin);
	}
	
	public static String play()
	{
		String options[]={"rock", "paper", "scissors"};
		int val=(int)(Math.random()*3);
		return options[val];
	}
	
	public static double[][] getWinning(int winnings,int n)
	{
	 double percentAvg[][]=new double[2][2];
	 percentAvg[0][0]=((double)winnings/n)*100;
	 percentAvg[1][0]=100-percentAvg[0][0];
	 percentAvg[0][1]=winnings;
	 percentAvg[1][1]=n-winnings;
	 return percentAvg;
	}
    public static void display(double answer[][])
	{
	  System.out.println("\n\t\tUser\tComputer");
        System.out.println("--------------------------------------------");
       System.out.printf("Win Percentage: %.2f%%\t%.2f%%\n", answer[0][0], answer[1][0]);
        System.out.println("--------------------------------------------");
        System.out.printf("Win score        : %.2f%%\t%.2f%%\n", answer[0][1], answer[1][1]);

	}
	
	public static boolean winingCheck(String user,String computer)
	{
		if(user.equals("rock") && computer.equals("scissors")) return true;
		else if(user.equals("paper") && computer.equals("rock")) return true;
		else if(user.equals("scissors") && computer.equals("paper")) return true;
		else return false;
	}
	
}