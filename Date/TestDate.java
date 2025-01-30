package Date;
public class TestDate {
    public static void main(String[] args) {
        // Create a Date object
        Date newDate = new Date(9, 5, 2025);

        // Print initial date
        System.out.println("Initial Date: " + newDate.toString());

        // Modify the date using setters
        newDate.setDay(15);
        newDate.setMonth(10);
        newDate.setYear(2030);

        // Print updated date
        System.out.println("Updated Date: " + newDate.toString());

        // Set a new date using setDate()
        newDate.setDate(1, 1, 2000);
        System.out.println("New Date: " + newDate.toString());
    }
}
