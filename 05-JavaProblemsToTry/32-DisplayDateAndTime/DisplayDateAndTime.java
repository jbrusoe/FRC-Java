import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DisplayDateAndTime {
  public static void main(String[] args) {
    LocalDateTime CurrentDate = LocalDateTime.now();
    
    DateTimeFormatter CurrentDateFormatted = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy hh:mm:ss a");

    System.out.println("Current Date & Time: " + CurrentDate.format(CurrentDateFormatted));
  }
}