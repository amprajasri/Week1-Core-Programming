import java.util.Scanner;
public class OddEvenArray{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
if(n<=0){
System.out.println("not a natural number");
System.exit(0);
}
int size=(n/2)+1;
int evenNumbers[]=new int[size];
int oddNumbers[]=new int[size];
int evenIndex=0,oddIndex=0;
int temp;
for(int i=0;i<n;i++){
 temp=input.nextInt();
 if(temp%2==0){
  evenNumbers[evenIndex]=temp;
  evenIndex++;
 }
 else{
    oddNumbers[oddIndex]=temp;
	oddIndex++;
 }
}
System.out.print("even Numbers: ");
for(int i=0;i<evenIndex;i++){
System.out.print(evenNumbers[i]+" ");
}
System.out.println();
System.out.print("odd Numbers: ");
for(int i=0;i<oddIndex;i++){
System.out.print(oddNumbers[i]+" ");
}
}
}