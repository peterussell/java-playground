import java.util.*;

public class Delimiters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What are your 3 favourite numbers? (enter on a single line)");

        // "Delimiter pattern": whitespace is the default delimiter. Scanner will skip the delimiter
        // and get the next value. So we can enter as many spaces as we want (or newlines, tabs) between
        // the values, and it will still work.
        // eg. entering "1     2   3" will print "Your favourite numbers are 1, 2, 3"
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Your favourite numbers are " + num1 + ", " + num2 + ", " + num3);

        // "Scan.nextLine() trap": happens when scan.nextLine() *follows*
        //  - scan.nextInt(),
        //  - scan.nextLong()
        //  - scan.nextDouble(),
        //  - scan.next()

        // This is because scan.nextInt() etc. don't clear the newline character, so nextLine() sees it
        // and returns the remainder of that line.

        // eg. > 12\n
        // nextInt() returns 12. Line remaining is "\n"
        // nextLine() returns "\n" and doesn't wait for the next user input

        // Solution: need an additional scan.nextLine() after nextInt() etc. to clear the remaining line.
        sc.nextLine();

        System.out.println("Please confirm your numbers:");
        String allNums = sc.nextLine();

        System.out.println("Your favourite numbers are " + allNums);

        sc.close();
    }
}