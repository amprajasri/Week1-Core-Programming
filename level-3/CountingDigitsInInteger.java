import java.util.Scanner;
public class CountingDigitsInInteger{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 int n=input.nextInt();
 int count=0;
 int last_number;
 while(n>0){
  last_number=n%10;
  n=n/10;
  count++;
 }
 System.out.println(count);
}
}