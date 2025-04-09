import java.util.Scanner;
public class FindingYoungestTallest{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int amarAge=input.nextInt();
int akbarAge=input.nextInt();
int anthonyAge=input.nextInt();
float amarHeight=input.nextFloat();
float akbarHeight=input.nextFloat();
float anthonyHeight=input.nextFloat();
if(amarAge<anthonyAge && amarAge<akbarAge){
System.out.println("amar is youngest");
}
else if(anthonyAge>amarAge && anthonyAge>akbarAge){
	System.out.println("akbar is youngest");
}
else{
	System.out.println("akbar is youngest");

}
if(amarHeight>anthonyHeight && amarHeight>akbarHeight){
System.out.println("amar is youngest");
}
else if(anthonyHeight<amarHeight && anthonyHeight<akbarHeight){
	System.out.println("akbar is youngest");
}
else{
	System.out.println("akbar is youngest");

}


}
}