public class Variables {
    public static void main(String[] args) {
        // === INT ===
        // (4 bytes: -2,147,483,648 to 2,147,483,647)
        // The max int value
        int maxValue = Integer.MAX_VALUE; // 2,147,483,647 (~2 billion)
        System.out.println("Max value: " + maxValue);

        // If we increase, it wraps to Integer.MIN_VALUE
        int overflowedMaxValue = maxValue + 1; // -2,147,483,648
        System.out.println("Max value + 1: " + overflowedMaxValue);

        // === LONG ===
        // (8 bytes: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808)
        // Longs need an 'L' after them; 8 bytes
        long massiveNumber = 8000000000L;
        System.out.println("My massive number is " + massiveNumber);

        // We can use underscores for readability
        massiveNumber = 8_000_000_000L;
        System.out.println("Number using underscores for readability " + massiveNumber);

        // === DOUBLE ===
        // (8 bytes: up to 15 significant digits)
        // Stores decimals
        double percentage = 73.5;
        System.out.println(percentage + "% of percentages are made up.");

        // Don't do this - always use doubles for math
        int tmp1 = 20;
        int tmp2 = 3;
        System.out.println(tmp1 / tmp2); // 6

        double tmp3 = 20;
        double tmp4 = 3;
        System.out.println(tmp3 / tmp4); // 6.666666666666667

    }
}