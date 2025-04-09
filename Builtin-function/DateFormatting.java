import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;
public class DateFormatting
{
    public static void main(String[] args)
	{
		 ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		 DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		 System.out.println("Current Time in dd/MM/yyyy: " + istTime.format(formatter1));
         System.out.println("Current Time in yyyy-MM-dd: " + istTime.format(formatter2));
         System.out.println("Current Time in EEE, MMM dd, yyyy: " + istTime.format(formatter3));
       
	}
}