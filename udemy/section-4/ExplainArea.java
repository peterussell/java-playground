public class ExplainArea {
    public static void main(String[] args) {
        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
        String italianExplanation = explainArea("Italian");

        System.out.println(String.format("English: %s", englishExplanation));
        System.out.println(String.format("French: %s", frenchExplanation));
        System.out.println(String.format("Spanish: %s", spanishExplanation));
        System.out.println(String.format("Italian: %s", italianExplanation));
    }

    /**
     * Returns an explanation of how to calculate the area of an object
     * in the specified language.
     *
     * @param language The language for the description
     * @return A description of how to calculate an object's area in the given language
     */
    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "Area es igual a largo * ancho";
            default:
                return "Language not recognized";
        }
    }
}