public class Main {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    /**
     * Checks if numbers are equal, different or neither.
     */
    public static void printEqual(int a, int b, int c) {
        // Checks for invalid value.
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // Checks if all numbers are equal.
        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        }

        // Checks if all numbers are different.
        else if (a != b && b != c && a != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}