public class PrintInitials {
    public static void main(String args[]) {
        String[] p = GetP();
        String[] r = GetR();

        // Constraint: both arrays must be same size
        for (int i=0; i<p.length; i++) {
            System.out.println(String.format("%s    %s", p[i], r[i]));
        }
    }

    private static String[] GetP() {
        return new String[] {
            "PPPP ",
            "P   P",
            "P   P",
            "PPPP ",
            "P    ",
            "P    ",
            "P    "
        };
    }

    private static String[] GetR() {
        return new String[] {
            "RRRR ",
            "R   R",
            "R   R",
            "RRRR ",
            "R R  ",
            "R  R ",
            "R   R"
        };
    }
}