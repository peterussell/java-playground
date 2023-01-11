public class Scope {
    static int classApples = 100;

    public static void main(String[] args) {
        someFunction();
    }

    private static void someFunction() {
        int functionApples = 5;

        System.out.println(classApples);
        System.out.println(functionApples);
    }
}