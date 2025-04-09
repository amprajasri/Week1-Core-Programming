import java.util.Scanner;
import java.lang.Math;
public class Cards
{
	public static void main(String[] args)
	{
	
	 Scanner input=new Scanner(System.in);
	 int n=input.nextInt();
	 String deck[]=getDeckOfCards();
	 String suffledDeck[]=getSuffledDeckOfCards(deck);
	if(deck.length%n==0) 
	 {
		 System.out.println("it is possible to distribute");
		 String playerCards[][]=getPlayerCards(suffledDeck,n);
		 display(playerCards);
	 }
	 else
	 {
		 System.out.println("can not be distributed");
	 }
	}
	
	public static String[] getDeckOfCards()
	{
		String suits[]={"Hearts", "Diamonds", "Clubs", "Spades"};
		String ranks[]={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		int numOfCards = suits.length * ranks.length;
		String deck[]=new String[numOfCards];
		int index=0;
		for(int i=0;i<suits.length;i++)
		{
			for(int j=0;j<ranks.length;j++)
			{
				deck[index]=ranks[j]+" of "+suits[i];
				index++;
			}
		}
		return deck;
	}
	
	public static String[] getSuffledDeckOfCards(String deck[])
	{
		String temp;
		for(int i=0;i<deck.length;i++)
		{
			int randomCardNumber=i+(int)(Math.random()*(deck.length-i));
			temp=deck[i];
			deck[i]=deck[randomCardNumber];
			deck[randomCardNumber]=temp;
		}
		return deck;
	}
	
	public static String[][] getPlayerCards(String deck[],int n)
	{
		int cardsForEachPlayer=deck.length/n;
		String result[][]=new String[n][cardsForEachPlayer];
		int index=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<cardsForEachPlayer;j++)
			{
				result[i][j]=deck[index];
				index++;
			}
		}
		return result;
	}
	
	public static void display(String playerCards[][])
	{
		System.out.println("player \t cards");
		for(int i=0;i<playerCards.length;i++)
		{
			System.out.println("---------------------------------------------------------------------------------------------------------------------");
			System.out.print((i+1)+" \t");
			for(int j=0;j<playerCards[0].length;j++)
			{
				System.out.print(playerCards[i][j]+" ,");
			}
			System.out.println();
		}
		
	}
}