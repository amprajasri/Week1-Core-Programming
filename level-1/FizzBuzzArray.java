import java.util.Scanner;
public class FizzBuzzArray{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 int n=input.nextInt();
 String result[]=new String[n+1];
 if(n>0){
 for(int i=0;i<=n;i++){
  if(i%3==0 &&  i%5==0){
   result[i]="FizzBuzz";
  }
  else if(i%3==0){
   result[i]="Fizz";
  }
  else if(i%5==0){
   result[i]="Buzz";
  }
  else{
    result[i]=String.valueOf(i);
  }
 }  
 }
 for(int i=0;i<=n;i++)
 System.out.println(result[i]);
 
}
}