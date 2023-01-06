import java.util.*;

public class SwitchStatements {
    public static void main(String[] args) {
        List<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        System.out.println("What day do you want to hang out?");

        days.forEach((String day) -> {
           System.out.println(String.format("\t%s", day));
        });

        Scanner sc = new Scanner(System.in);
        String hangoutDay = sc.nextLine();

        sc.close();

        switch (hangoutDay) {
            case "Monday":
                System.out.println("Can't");
                break;
            case "Tuesday":
                System.out.println("Busy");
                break;
            case "Wednesday":
                System.out.println("Let's do it");
                break;
            case "Thursday":
                System.out.println("Yeah");
                break;
            case "Friday":
                System.out.println("Perhaps");
                break;
            case "Saturday":
                System.out.println("Sure");
                break;
            case "Sunday":
                System.out.println("Certainly");
                break;
            default:
                System.out.println("I don't know that day of the week");
        }
    }
}