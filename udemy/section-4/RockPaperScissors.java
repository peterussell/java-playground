import java.util.Scanner;

public class RockPaperScissors {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        printWelcome();

        String userChoice = "", computerChoice = "";

        while (!userChoice.equals("exit")) {
            userChoice = getUserChoice();
            computerChoice = getComputerChoice();

            if (checkForExit(userChoice)) {
                System.out.println("Thanks for playing!");
                System.exit(0);
            }

            System.out.println(String.format("You chose: %s", userChoice));
            System.out.println(String.format("Computer chose: %s", computerChoice));

            if (checkForDraw(userChoice, computerChoice)) {
                System.out.println("It's a draw. That all you got?");
            } else if (checkForRocketLauncher(userChoice)) {
                System.out.println("Sneak attack. BOOM. You win.");
            } else if (checkWinner(userChoice, computerChoice)) {
                System.out.println(String.format("Winner winner chicken dinner! (%s beats %s)", userChoice, computerChoice));
            } else {
                System.out.println(String.format("You lose. Loser. (%s beats %s)", computerChoice, userChoice));
            }

            System.out.println();
        }

        sc.close();
    }

    private static void printWelcome() {
        System.out.println("===================================");
        System.out.println("Welcome to RPS. Prepare for battle.");
        System.out.println("('exit' to exit)");
        System.out.println("===================================");
    }

    private static String getUserChoice() {
        System.out.println("Time to choose, punk: rock, paper, or scissors?");
        String choice = sc.nextLine();

        if (
            choice.equals("rock")
            || choice.equals("paper")
            || choice.equals("scissors")
            || choice.equals("rocket launcher")
            || choice.equals("exit")) {
            return choice;
        } else {
            System.out.println(String.format("A %s isn't gonna fly here. Try again.", choice));
            return getUserChoice();
        }
    }

    private static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);

        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
            default:
                return "scissors";
        }
    }

    private static boolean checkForExit(String userChoice) {
        return userChoice.equals("exit");
    }

    private static boolean checkForDraw(String userChoice, String computerChoice) {
        return userChoice.equals(computerChoice);
    }

    private static boolean checkForRocketLauncher(String userChoice) {
        return userChoice.equals("rocket launcher");
    }

    private static boolean checkWinner(String userChoice, String computerChoice) {
        if (userChoice.equals("rock")) {
            if (computerChoice.equals("paper")) {
                return false;
            } else if (computerChoice.equals("scissors")) {
                return true;
            }
        }

        if (userChoice.equals("paper")) {
            if (computerChoice.equals("scissors")) {
                return false;
            } else if (computerChoice.equals("rock")) {
                return true;
            }
        }

        if (userChoice.equals("scissors")) {
            if (computerChoice.equals("rock")) {
                return false;
            } else if (computerChoice.equals("paper")) {
                return true;
            }
        }

        return false;
    }
}