import java.util.Scanner;
public class SpringSeasonChecking{
public static void main(String[] args){
Scanner input =new Scanner(System.in);
int month=input.nextInt();
int day=input.nextInt();
boolean flag;
if((month>3 && month<6) ){
 flag=true;
}
else if((month==3)&& (day>20)){
 flag=true;
}
else if((month==6) && (day<20)){
 flag=true;
}
else{
flag=false;
}
if (flag){
System.out.println("Its a Spring Season");
}
else{
System.out.println("Not a Spring Season");
}
}
}