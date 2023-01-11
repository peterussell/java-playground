import java.util.Scanner;

public class DiceJack {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int[] userNums = new int[3];
        int[] diceRolls = new int[3];

        System.out.println("Enter 3 numbers");

        for (int i=0; i<3; i++) {
            userNums[i] = getUserNumber();
            diceRolls[i] = rollDice();

            if (userNums[i] < 1 || userNums[i] > 6) {
                System.out.println("Invalid number");
                System.exit(1);
            }
        }

        printNumbersWithSum("Your numbers", userNums);
        printNumbersWithSum("Rolled numbers", diceRolls);

        if (checkWinner(userNums, diceRolls)) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Better luck next time.");
        }

        sc.close();
    }

    private static int getUserNumber() {
        return sc.nextInt();
    }

    private static int rollDice() {
        return (int)((Math.random() * 6) + 1);
    }

    private static boolean checkWinner(int[] userNumbers, int[] diceRolls) {
        int userNumbersSum = 0;
        int diceRollsSum = 0;

        for (int i=0; i<userNumbers.length; i++) {
            userNumbersSum += userNumbers[i];
            diceRollsSum += diceRolls[i];
        }

        int delta = userNumbersSum - diceRollsSum;

        return delta > 0 && delta < 3;
    }

    private static void printNumbersWithSum(String title, int[] numbers) {
        int sum = 0;

        System.out.print(String.format("%s { ", title));
        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
            System.out.print(String.format("%d, ", numbers[i]));
        }
        System.out.println(String.format("}; sum = %d", sum));
    }
}