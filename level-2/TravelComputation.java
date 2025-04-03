import java.util.Scanner;
public class TravelComputation {
   
   public static void main(String[] args) {
      Scanner input=new Scanner(System.in); 
      String name = input.nextLine();
      String fromCity = input.nextLine(), viaCity = input.nextLine(), toCity = input.nextLine();
      double distanceFromToVia = input.nextDouble();
      int timeFromToVia =input.nextInt();
      double distanceViaToFinalCity =input.nextDouble();
      int timeViaToFinalCity =input.nextInt();
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      int totalTime = timeFromToVia + timeViaToFinalCity;
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}
