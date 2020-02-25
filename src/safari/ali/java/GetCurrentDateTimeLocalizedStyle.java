package safari.ali.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class GetCurrentDateTimeLocalizedStyle {
    public static void main(String[] args) {
        // Get Current Date time in localized style
        CurrentDateTime dateTime = new CurrentDateTime();
        System.out.println(dateTime.getCurrentLocalTimeDate());

        // Get Current Date time using predefined constants
        System.out.println(dateTime.DT_BASIC_ISO_DATE());

        // Get Current date and time with pattern
        System.out.println(dateTime.CurrentDTwithPattern());
    }
}

class CurrentDateTime {
    public String getCurrentLocalTimeDate() {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String formatted = current.format(formatter);

        return "Current Date is: " + formatted;

    }

    public String DT_BASIC_ISO_DATE(){
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formatted = current.format(formatter);

        return "Current Date is: " + formatted;
    }
    public String CurrentDTwithPattern(){
        //  Get Current date and time with pattern
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted = current.format(formatter);

        return  "Current Date and Time is: " + formatted;
    }
}

