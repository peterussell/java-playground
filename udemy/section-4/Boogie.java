public class Boogie {
    public static void main(String[] args) {
        var boogie = new Boogie();

        for (int i=0; i<4; i++) {
            boogie.singChorus();
        }
    }

    private void singChorus() {
        this.dontBlame("sunshine");
        this.dontBlame("moonlight");
        this.dontBlame("good times");
        this.doBlame("boogie");

        System.out.println();
    }

    private void dontBlame(String subject) {
        System.out.println("Don't blame it on the " + subject);
    }

    private void doBlame(String subject) {
        System.out.println("Blame it on the " + subject);
    }
}