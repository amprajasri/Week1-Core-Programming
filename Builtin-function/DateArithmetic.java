import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateArithmetic
{
    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a date (yyyy-MM-dd): ");
		String inputDate = input.nextLine();
		LocalDate date = LocalDate.parse(inputDate);
		LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Modified Date: " + modifiedDate.format(formatter));
        
	}
}