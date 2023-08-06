import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class TimeConversion {

	private static final DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-M-yyyy hh:mm:ss a z");
	public static void main(String[] args)
	{
		ZoneId sourceTimeZone=ZoneId.of("Asia/Kolkata");
		ZoneId destinationTimeZone=ZoneId.of("Europe/London");
		LocalDateTime todayDateTime=LocalDateTime.now();
		
		ZonedDateTime currentISTZonedDateTime=todayDateTime.atZone(sourceTimeZone);
		ZonedDateTime currentBSTZonedDateTime=currentISTZonedDateTime.withZoneSameInstant(destinationTimeZone);
		
		System.out.println(dateTimeFormatter.format(currentISTZonedDateTime));
		System.out.println(dateTimeFormatter.format(currentBSTZonedDateTime));
	}
}
