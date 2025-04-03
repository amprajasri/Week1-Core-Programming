import java.util.Scanner;
public class maxHandshakes{
 public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  int n=input.nextInt();
  float tot=(n*(n-1))/2;
  System.out.println("maximum number of handshakes among "+n+" number of students: "+tot);
 }
}