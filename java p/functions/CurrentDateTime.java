import java.time.LocalDateTime;

public class CurrentDateTime {

    // Method to show current date and time
    static void showDateTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);
    }

    public static void main(String[] args) {
        showDateTime();
    }
}