// Java Date and Time
// Java Dates
// Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API.
// The package includes many date and time classes. For example:

// Class	Description
// LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
// LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
// LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
// DateTimeFormatter	Formatter for displaying and parsing date-time objects

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // import the DateTimeFormatter class
public class JavaDate {
    public static void main(String[] args) {
        // Display Current Date
        LocalDate currentDate = LocalDate.now(); // Create a date object
        System.out.println("Current Date: " + currentDate);

        // Display Current Time
        LocalTime currentTime = LocalTime.now(); // Create a time object
        System.out.println("Current Time: " + currentTime);

        // Display Current Date and Time
        LocalDateTime currentDateTime = LocalDateTime.now(); // Create a date-time object
        System.out.println("Current Date and Time: " + currentDateTime);

        // Formatting Date and Time
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        // Additional Formatting Examples
        DateTimeFormatter formatterExample1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterExample2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterExample3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter formatterExample4 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

        System.out.println("Formatted Example 1: " + currentDateTime.format(formatterExample1));
        System.out.println("Formatted Example 2: " + currentDateTime.format(formatterExample2));
        System.out.println("Formatted Example 3: " + currentDateTime.format(formatterExample3));
        System.out.println("Formatted Example 4: " + currentDateTime.format(formatterExample4));
    }
}
