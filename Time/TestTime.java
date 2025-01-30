package Time;

public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Display initial times
        System.out.println("Initial Times:");
        System.out.println("t1: " + t1.toString());
        System.out.println("t2: " + t2.toString());

        // Call nextSecond for t1 and previousSecond for t2
        t1.nextSecond();
        t2.previousSecond();

        // Display final times
        System.out.println("\nAfter Modification:");
        System.out.println("t1 (next second): " + t1.toString());
        System.out.println("t2 (previous second): " + t2.toString());
    }
}
