import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysUntilSeptember18 {
    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();

        // Define the target date
        LocalDate targetDate = LocalDate.of(2024, 9, 18);

        // Calculate the number of days until the target date
        long daysUntilTarget = ChronoUnit.DAYS.between(today, targetDate);

        // Output the result
        System.out.println("There are " + daysUntilTarget + " days until September 18, 2024.");
    }
}