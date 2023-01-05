import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numQuestions = 0;

        System.out.println("Welcome. Thank you for taking the survey");

        System.out.println("What is your name");
        String name = scanner.nextLine();
        numQuestions++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();
        numQuestions++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        numQuestions++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();
        numQuestions++;

        System.out.println("\nHow many times a week do you buy food?");
        int foodAmount = scanner.nextInt();
        numQuestions++;

        scanner.close();

        System.out.println("Thank you " + name + " for answering all " + numQuestions + " questions.");
        System.out.println("Weekly, you spend $" + (coffeePrice * coffeeAmount) + " on coffee");
        System.out.println("Weekly, you spend $" + (foodPrice * foodAmount) + " on food");
    }
}